package sec8.test.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationTest {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

//        Set<Integer> set3 = new TreeSet<>(set1);

        // 합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("합집합 : " + union);

        // 교집합
        Set<Integer> intersaction = new HashSet<>(set1);
        intersaction.retainAll(set2);

        System.out.println("교집합 :" + intersaction);

        // 차집합
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합  " + difference);


        /*// 합집합
        Set<Integer> union = new HashSet<>(set1);
        set1.addAll(set2);
        System.out.println("합집합 : " + union);

        // 교집합
        set3.clear();

        for (Integer s1 : set1){
            for (Integer s2 : set2){
                if (s1.equals(s2)){
                    set3.add(s1);
                }
            }
        }

        System.out.println("교집합 : " + set3);

        // 차집합
        set3.clear();
        for (Integer s1 : set1){
            for (Integer s2 : set2){
                if (s1.equals(s2)){
                    set3.add(s1);
                }
            }
        }

        set1.removeAll(set3);

//        set3.addAll(set1);

        System.out.println("차집합 : " + set1);

    }*/
    }
}
