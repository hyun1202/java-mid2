package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        System.out.println(set);
        boolean result = set.add("A");
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        // 검색
        String searchValue = "A";
        System.out.println("set.contains(A): " + set.contains(searchValue));

        String removeValue = "A";
        boolean removeResult = set.remove(removeValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println("set.contains(A): " + set.contains(removeValue));
        System.out.println(set);
    }
}
