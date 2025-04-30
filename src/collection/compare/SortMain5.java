package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

        System.out.println("Comparable 정렬");
        System.out.println(treeSet1);

        // 넣을 때부터 정렬하므로  비교자를 제공할 땐 생성자에 입력해주어야 함
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("id comparator 정렬");
        System.out.println(treeSet2);
    }
}
