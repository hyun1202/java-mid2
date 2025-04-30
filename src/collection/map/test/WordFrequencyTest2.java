package collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 같은 단어가 나타난 수
public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] strings = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, ++count);
        }
        System.out.println(map);
    }
}
