package sec9.test.ex3;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        // Map 에 들어있는 데이터 중 값이 1000원인 모든 상품 출력
        Map<String, Integer> map = new HashMap<>();
        List<String> s = new ArrayList<>();

        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // keySet 사용
        /*for (String key : map.keySet()){

            if (map.get(key) >= 1000){
                s.add(key);
            }
        }*/

        // entrySet 사용
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() >= 1000){
                s.add(entry.getKey());
            }
        }

        System.out.println(s);
    }
}
