package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 불변 컬렉션
        List<Integer> list = List.of(1, 2, 3);
//        list.add(1); // 불가.
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        // class java.util.ImmutableCollections$ListN -> 불변 클래스
        System.out.println("list class = " + list.getClass());
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());
    }
}
