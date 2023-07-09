package Homework2_13.Impl;

import Homework2_13.Exception.ElementNotFoundException;
import Homework2_13.Exception.InvalidIndexException;
import Homework2_13.Exception.NullItemException;
import Homework2_13.Exception.StorageIsFullException;
import Homework2_13.Interface.StringList;

import java.util.Arrays;


public class StringListImpl implements StringList {
    private int size;
    private final String[] m;

    public StringListImpl() {
        m = new String[10];
    }
    public StringListImpl(int initSize) {
        m = new String[initSize];
    }


    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);
        m[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateSize();
        validateItem(item);
        validateIndex(index);

        if (index == size) {
            m[size++] = item;
            return item;
        }

        System.arraycopy(m,index,m,index+1,size-index);
        m[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);
        m[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        int index = indexOf(item);

        return remove(index);
    }

    @Override
    public String remove(int index) {
        validateIndex(index);

        String item = m[index];

        if (index != size) {
            System.arraycopy(m,index+1,m,index, size-index);
        }

        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) >-1;
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
        return m[index];
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
