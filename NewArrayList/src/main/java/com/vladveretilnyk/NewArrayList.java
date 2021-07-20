package com.vladveretilnyk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

public class NewArrayList<E> extends AbstractList<E> {
    private Object[] data;

    public NewArrayList() {
        data = new Object[0];
    }

    @Override
    public boolean add(Object o) {
        data = grow();
        data[data.length - 1] = o;
        return true;
    }

    private Object[] grow() {
        return Arrays.copyOf(data, data.length + 1);
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public E get(int index) {
        return (E) data[index];
    }

    private class Itr implements Iterator<E> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor != data.length;
        }

        @Override
        public E next() {
            return (E) data[cursor++];
        }
    }
}
