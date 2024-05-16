package sec9.test.ex1;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {

        /*Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);*/

        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        int total = 0;

        Map<String, Integer> map3 = new HashMap<>();

        // 공통으로 들어있는 키 찾고 그 값의 합
        /*for (String key1 : map1.keySet()){
            for (String key2 : map2.keySet()){
                if (key1.equals(key2)){
                    map3.put(key1, map1.get(key1) + map2.get(key1));
                }
            }
        }*/

        // 답안
        for(String key1 : map1.keySet()){
            if (map2.containsKey(key1)){
                map3.put(key1, map1.get(key1) + map2.get(key1));
            }
        }

        System.out.println(map3);

    }
}
