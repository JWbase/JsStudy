package arraylist;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Jsp");
        set.add("Java");
        set.add("Spring");

        int size = set.size();
        System.out.println("size = " + size);
    }
}
