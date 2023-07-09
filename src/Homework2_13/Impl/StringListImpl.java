package Homework2_13.Impl;

import Homework2_13.Exception.InvalidIndexException;
import Homework2_13.Exception.NullItemException;
import Homework2_13.Exception.StorageIsFullException;
import Homework2_13.Interface.StringList;

import java.util.Arrays;


public class StringListImpl implements StringList {
    private int size;
    private static String[] m;

    public StringListImpl() {
        m = new String[10];
    }
    public StringListImpl(int initSize) {
        m = new String[initSize];
    }


    @Override
    public String add(String item) {
        for (int i = 0; i < size; i++) {
            if (m[i] == null) {
                m[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {
//        for (int i = 0; i < size; i++) {
//
//        }
        return item;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) !=-1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            String s = m[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size-1; i >= 0; i--) {
            String s = m[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(m, size);
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }
    private void validateSize() {
        if (size == m.length) {
            throw new StorageIsFullException();
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException();
        }
    }
}
