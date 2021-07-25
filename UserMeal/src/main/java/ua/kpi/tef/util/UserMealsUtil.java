package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000).forEach(System.out::println);
//        .toLocalDate();
//        .toLocalTime();
    }

    // Solve using streams

    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO return filtered list with correctly exceeded field
        Map<LocalDate, Integer> caloriesByDate = mealList.stream().
                collect(Collectors.groupingBy(userMealItem -> userMealItem.getDateTime().toLocalDate(),
                        Collectors.summingInt(UserMeal::getCalories)));

        return mealList.stream().
                filter(userMealItem -> TimeUtil.isBetween(userMealItem.getDateTime().toLocalTime(), startTime, endTime)).
                map(userMealItem -> new UserMealWithExceed(userMealItem.getDateTime(), userMealItem.getDescription(), userMealItem.getCalories(),
                        caloriesByDate.get(userMealItem.getDateTime().toLocalDate()) > caloriesPerDay)).
                collect(Collectors.toList());
    }

    // Solve using loops

//    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
//        // TODO return filtered list with correctly exceeded field
//        Map<LocalDate, Integer> caloriesByDate = new HashMap<>();
//
//        for (UserMeal userMeal : mealList) {
//            LocalDate date = userMeal.getDateTime().toLocalDate();
//            caloriesByDate.put(date, caloriesByDate.getOrDefault(date, 0) + userMeal.getCalories());
//        }
//
//        List<UserMealWithExceed> userMealWithExceeds = new ArrayList<>();
//
//        for (UserMeal userMeal : mealList) {
//            boolean isExceed = caloriesByDate.get(userMeal.getDateTime().toLocalDate()) > caloriesPerDay;
//
//            if (TimeUtil.isBetween(userMeal.getDateTime().toLocalTime(), startTime, endTime)) {
//                userMealWithExceeds.add(new UserMealWithExceed(userMeal.getDateTime(), userMeal.getDescription(), userMeal.getCalories(), isExceed));
//            }
//
//        }
//
//        return userMealWithExceeds;
//    }
}
