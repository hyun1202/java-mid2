package collection.map.test;

import java.util.*;

// 1000원인 상품 출력
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> result = new ArrayList<>();

        int targetValue = 1000;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (targetValue == entry.getValue()) {
                result.add(entry.getKey());
            }
        }
        System.out.println(result);
    }
}
