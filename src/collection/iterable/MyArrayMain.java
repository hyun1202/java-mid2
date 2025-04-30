package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray arr = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
