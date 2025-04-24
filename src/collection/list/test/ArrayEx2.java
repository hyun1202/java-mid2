package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx2 {
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

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                break;
            }
            System.out.print(list.get(i) + ", ");
        }
    }
}
