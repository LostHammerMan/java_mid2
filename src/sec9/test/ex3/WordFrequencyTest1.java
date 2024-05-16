package sec9.test.ex3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < text.length(); i++){
            int index = text.indexOf("apple", i, text.length());
            int index2 = text.indexOf("orange", i, text.length());
            int index3 = text.indexOf("banana", i, text.length());

            if (i == index){
                count++;
            }

            if (i == index2){
                count2++;
            }
            if (i == index3){
                count3++;
            }
        }

        map.put("orange", count2);
        map.put("apple", count);
        map.put("banana", count3);

        System.out.println("map = " + map);

    }
}
