package collection.list.test;

import java.util.List;

public class ArrayEx1 {
    public static void main(String[] args) {
        List<Integer> students = List.of(90, 80, 70, 60, 50);

        int total = 0;

        for (Integer s : students) {
            total += s;
        }
        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
