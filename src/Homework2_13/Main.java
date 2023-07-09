package Homework2_13;

import Homework2_13.Impl.StringListImpl;
import Homework2_13.Interface.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList m = new StringListImpl(5);
        System.out.println("m.size() = " + m.size());
        m.add("dfs");
        m.add(2, "drwthyh");
        System.out.println(Arrays.toString(m.toArray()));
    }
}