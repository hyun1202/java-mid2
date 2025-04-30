package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        Integer addCount = cartMap.getOrDefault(product, 0);
        cartMap.put(product, addCount + count);
    }

    public void printAll() {
        System.out.println("상품 출력");
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusCount) {
        Integer count = cartMap.get(product);

        int result = count - minusCount;
        if (result <= 0) {
            cartMap.remove(product);
            return;
        }
        cartMap.put(product, result);
    }
}
