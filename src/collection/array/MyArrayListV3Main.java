package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3(2);
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 마지막에 추가
        System.out.println("add last");
        list.add(3, "addList");
        System.out.println(list);

        // 처음에 추가
        System.out.println("add first");
        list.add(0, "addFirst");
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4); // O(1)
        System.out.println("removed(4) = " + removed1);
        System.out.println("list = " + list);

        Object removed2 = list.remove(0); // O(n)
        System.out.println("removed(0) = " + removed2);
        System.out.println("list = " + list);
    }
}
