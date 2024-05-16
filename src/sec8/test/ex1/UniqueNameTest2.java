package sec8.test.ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

//        for (Integer input : inputArr){
//            set.add(input);
//        }

        for (Integer s : set){
            System.out.println(s);
        }
    }
}
