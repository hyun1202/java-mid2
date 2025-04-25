package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);
        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        // 검색
        int searchValue = 9;
        System.out.println("set.contains(9): " + set.contains(searchValue));

        int removeValue = 99;
        boolean removeResult = set.remove(removeValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println("set.contains(99): " + set.contains(removeValue));
        System.out.println(set);
    }
}
