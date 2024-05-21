package sec10.ex.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {

        // 불변
        List<Integer> list = List.of(1,2,3);

        // 가변
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("MutableList = " + mutableList);
        System.out.println("MutableList Class = " + mutableList.getClass());

        // 불변
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());


    }
}
