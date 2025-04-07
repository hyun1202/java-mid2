package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String s = list.get(0);
        System.out.println("s = " + s);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer i = intList.get(0);
        System.out.println("i = " + i);
    }
}
