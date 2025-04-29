package collection.set.test;

import java.util.List;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(30, 20, 20, 10, 10);
        TreeSet<Integer> integers = new TreeSet<>(list);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
