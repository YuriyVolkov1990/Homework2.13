package Homework2_13;

import Homework2_13.Impl.StringListImpl;
import Homework2_13.Interface.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList m = new StringListImpl(6);

        m.add("ноль");
        System.out.println(Arrays.toString(m.toArray()));
        m.add(1, "один");
        m.add(2, "два");
        m.add(3, "три");
        m.add(4, "четыре");
        m.set(0, "замена ноля");
        System.out.println(Arrays.toString(m.toArray()));
        System.out.println("m.size() = " + m.size());
        m.remove("один");
        m.remove(4);
        System.out.println(Arrays.toString(m.toArray()));
        System.out.println("m.size() = " + m.size());
    }
}