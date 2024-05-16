package sec9.test.ex3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1_1 {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words){
            Integer count = map.get(word);

            if (count == null){
                count = 0;
            }
            count++;

            map.put(word, count);
        }

        // getOrDefault() 사용
        for (String word : words){
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        System.out.println("map = " + map);
        System.out.println("map2 = " + map2);
    }
}
