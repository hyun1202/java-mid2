package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Array -> Map
public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        HashMap<String, String> map = new HashMap<>();
        for (String[] p : productArr) {
            map.put(p[0], p[1]);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> next : entries) {
            String key = next.getKey();
            String value = next.getValue();
            System.out.println("제품: " + key + ", 가격: " + value);
        }
    }
}
