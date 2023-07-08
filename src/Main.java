import Impl.StringListImpl;
import Interface.StringList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList m = new StringListImpl(5);
        m.add("dfs");
        m.add("saa");
        m.add("sfwa");
        m.add("dfs");
        m.add("safaw");
        System.out.println(Arrays.toString(m.toArray()));
    }
}