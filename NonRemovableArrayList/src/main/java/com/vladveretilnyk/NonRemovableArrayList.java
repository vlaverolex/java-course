package com.vladveretilnyk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

public class NonRemovableArrayList<T> extends AbstractList<T> {
    private Object[] values;

    public NonRemovableArrayList() {
        values = new Object[]{};
    }

    public boolean add(T element) {
        values = grow();
        values[values.length - 1] = element;
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
        return values.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor != values.length;
        }

        @Override
        public T next() {
            return (T) values[cursor++];
        }
    }
}