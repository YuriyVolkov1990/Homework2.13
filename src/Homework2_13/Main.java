package Homework2_13;

import Homework2_13.Impl.StringListImpl;
import Homework2_13.Interface.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList m = new StringListImpl(5);
        m.add("dfs");
        m.add("saa");
        m.add("sfwa");
        System.out.println(Arrays.toString(m.toArray()));
//        System.out.println(m.isEmpty());
        String[] s = new String[5];
        s[0] = "papapap";
        System.out.println(Arrays.toString(s));
        List<String> l = new ArrayList<>(1);
        System.out.println("l.toArray() = " + Arrays.toString(l.toArray()));
    }
}