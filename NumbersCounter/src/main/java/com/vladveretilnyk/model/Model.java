package com.vladveretilnyk.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {
    private final Map<Integer, Integer> countingDigits = new HashMap<>();

    public void add(int number) {
        countingDigits.put(number, countingDigits.getOrDefault(number, 0) + 1);
    }

    public void add(List<Integer> list) {
        list.forEach(this::add);
    }

    public Map<Integer, Integer> getCountingDigits() {
        return new HashMap<>(countingDigits);
    }
}
