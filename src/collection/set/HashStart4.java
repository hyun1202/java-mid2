package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        // 나머지 연산 적용
        Integer[] inputArray = new Integer[CAPACITY];
        inputArray[hashIndex(1)] = 1;
        inputArray[hashIndex(2)] = 2;
        inputArray[hashIndex(5)] = 5;
        inputArray[hashIndex(8)] = 8;
        inputArray[hashIndex(14)] = 14;
        inputArray[hashIndex(99)] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        System.out.println("result = "+ inputArray[hashIndex(searchValue)]);
    }

    public static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
