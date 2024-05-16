package sec8.test.ex1;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();

        for (int inputVal : inputArr){
            set.add(inputVal);
        }

        for (Integer s : set){
            System.out.println(s);
        }
    }
}
