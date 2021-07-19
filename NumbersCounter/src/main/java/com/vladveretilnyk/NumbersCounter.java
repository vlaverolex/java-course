package com.vladveretilnyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersCounter {

    public static void main(String[] args) {
        NumbersCounter counter = new NumbersCounter();
        Map<Integer,Integer> map = counter.count(List.of(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));

        System.out.println(map);
    }

    public Map<Integer, Integer> count(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            map.put(number, map.containsKey(number) ? map.get(number) + 1 : 1);
        }

        return map;
    }
}
