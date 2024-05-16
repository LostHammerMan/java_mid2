package sec9.test.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {

        String[][] productArr = {{"java", "10000"}, {"spring", "20000"}, {"jpa", "30000"}};

        // 배열 -> Map
        /*Map<String, String> map = new HashMap<>();
        for (String[] product : productArr){
            map.put(product[0], product[1]);
        }*/

        Map<String, Integer> map = new HashMap<>();

        for (String[] product : productArr){
            map.put(product[0], Integer.valueOf(product[1]));
        }

        // Map 의 모든 데이터 출력
        /*for (Map.Entry<String, String> key : map.entrySet()){
            System.out.println("제품 : " + key.getKey() + ", 가격: " + key.getValue());
        }*/

        for (String key : map.keySet()){
            System.out.println("제품 : " + key + ", 가격 : " + map.get(key));
        }

    }
}
