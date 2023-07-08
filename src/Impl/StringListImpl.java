package Impl;

import Interface.StringList;


public class StringListImpl implements StringList {
    public static int size;
    public static String[] m;
    public StringListImpl(int size) {
        StringListImpl.size = size;
        m = new String[size];
    }


    @Override
    public String add(String item) {
        for (int i = 0; i < size-1; i++) {
            if (m[i] == null) {
                m[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {
        return null;
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
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return m;
    }
}
