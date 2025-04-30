package collection.map.test;

import java.util.HashMap;
import java.util.Map;

// 동일 키 값의 합
public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
//        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                Integer value1 = map1.get(key);
                Integer value2 = map2.get(key);
                resultMap.put(key, value1 + value2);
            }
        }

        System.out.println(resultMap);
    }
}
