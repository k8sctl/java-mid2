package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> productMap = new HashMap<>();

    public void add(Product product, int quantity) {
        int existQuantity = productMap.getOrDefault(product, 0);
        productMap.put(product, existQuantity + quantity);
    }

    public void minus(Product product, int quantity) {
        int existQuantity = productMap.getOrDefault(product, 0);
        // existQuantity -= quantity;
        int newQuantity = existQuantity - quantity;
        if (newQuantity <= 0) {
            productMap.remove(product);
        } else {
            productMap.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Product product : productMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + productMap.get(product));
        }
    }
}
