package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList(); // 자바5
        List<Object> list4 = List.of(); // 자바9

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
    }
}
