package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.print("n개의 정수를 입력하세요 (종료 0): ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }

        int total = 0;
        for (Integer i : list) {
            total += i;
        }

        double avg = (double) total / list.size();

        System.out.println("합계: " + total);
        System.out.println("평균: " + avg);
    }
}
