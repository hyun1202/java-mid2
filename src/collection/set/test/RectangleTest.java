package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        Rectangle rectangle2 = new Rectangle(20, 10);
        Rectangle rectangle3 = new Rectangle(20, 10);

        Set<Rectangle> set = new HashSet<>(List.of(rectangle, rectangle2, rectangle3));

        System.out.println(set);
    }
}
