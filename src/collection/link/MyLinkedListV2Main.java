package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== 데이터 중간 위치에 추가 ==");
        list.add(2, "d");
        System.out.println(list);
        list.add(1,"e");
        System.out.println(list);

        System.out.println("== 데이터 맨 앞 위치에 추가 ==");
        list.add(0, "f");
        System.out.println(list);

        System.out.println("== 데이터 삭제(2) ==");
        list.remove(2);
        System.out.println(list);

        System.out.println("== 데이터 맨 앞 삭제 ==");
        list.remove(0);
        System.out.println(list);
    }
}
