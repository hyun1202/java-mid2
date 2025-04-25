package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 배열에서 특정 데이터를 찾는 성능은 O(n)으로 느리다.
        int searchValue = 8;
        for (Integer input : inputArray) {
            if (input == searchValue) {
                System.out.println(input);
            }
        }


    }
}
