package sec9;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        //
        studentMap.put("A", 50);
        System.out.println("studentMap1 = " + studentMap);

        // 학생이 없는 경우에만 추가
        if (!studentMap.containsKey("A")){
            studentMap.put("A", 100);
        }

        System.out.println("studentMap2 = " + studentMap);

        // 학생 없는 경우에만 추가2
        studentMap.putIfAbsent("A", 100);
        studentMap.putIfAbsent("B", 80);
        System.out.println("studentMap3 = " + studentMap);
    }
}
