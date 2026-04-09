package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        // 1. 내 풀이
        /*
            Map<String, String> productMap = new HashMap<>();
            for (int i = 0 ; i < productArr.length ; i++) {
                productMap.put(productArr[i][0], productArr[i][1]);
            }
            // System.out.println(productMap);
        */

        // 2. 정답 풀이
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            String key = product[0];
            String value = product[1];
            productMap.put(key, Integer.valueOf(value));
        }

        // Map의 모든 데이터 출력
        for (String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }
    }
}
