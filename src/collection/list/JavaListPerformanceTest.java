package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);    // 113ms System.arraycopy() 를 이용하므로 시스템 레벨에서 데이터를 이동시킨다. (메모리 고속 복사)
        addMid(new ArrayList<>(), size);  // 54ms    메모리 고속 복사 이용
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);  // 1ms    // 찾는데 0(1), 데이터 추가(밀기) O(1)

        int loop = 10_000;
        System.out.println("==ArrayList 조회");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("==ArrayList 검색");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);   // 2ms
        addMid(new LinkedList<>(), size); // 945ms    // 조회 0(n), 데이터 추가 O(1)
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size); // 1880ms    // 조회 0(n), 데이터 추가 O(1)

        System.out.println("==LinkedList 조회");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("==LinkedList 검색");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균(중간) 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop +", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop +", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
