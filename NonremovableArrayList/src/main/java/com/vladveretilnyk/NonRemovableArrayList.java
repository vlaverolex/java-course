package com.vladveretilnyk;

import java.util.AbstractList;
import java.util.Arrays;

public class NonRemovableArrayList<T> extends AbstractList<T> {
    private Object[] values;
    private int size;

    public NonRemovableArrayList() {
        values = new Object[]{};
    }

    public boolean add(T element) {
        if (size == values.length) values = grow();
        values[size] = element;
        size++;
        return true;
    }

    @Override
    public T get(int index) {
        return (T) values[index];
    }

    private Object[] grow() {
        return Arrays.copyOf(values, values.length + 1);
    }

    @Override
    public int size() {
        return size;
    }
}
