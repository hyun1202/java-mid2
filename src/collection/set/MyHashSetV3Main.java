package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);

        // 검색
        String searchValue = "A";
        System.out.println("set.contains(A): " + set.contains(searchValue));
    }
}
