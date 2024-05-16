package sec3.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();

        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;

        for (int i= 0; i < students.size(); i++){
            total += students.get(i);
        }

        double average = (double) total / students.size();
        System.out.println("점수총합 : " + total);
        System.out.println("점수평균 :" + average);
    }


    public static class ListEx2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            List<Integer> list = new ArrayList<>();

            System.out.println("n 개의 정수 입력 (종료 0) :");

            while (true){
                int number = sc.nextInt();

                if (number != 0){
                    list.add(number);
                }else {
                    break;
                }
            }

    //        for (int i = 0; i< list.size(); i++){
    //            if (i != list.lastIndexOf(list.getLast())){
    //                System.out.print(list.get(i) + ", ");
    //            }else {
    //                System.out.println(list.get(i));
    //            }
    //        }
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
                if (i < list.size() -1){
                    System.out.print(", ");
                }
            }
        }
    }

    public static class ListEx3 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();
            int total = 0;
            double average = 0.0;
            System.out.println("n 개의 정수 입력(종료 0) ");

            while (true){
                int input = sc.nextInt();
                if (input == 0){
                    break;
                }
                numbers.add(input);
            }

            for (int number : numbers){
                total += number;
            }

            average = (double) total / numbers.size();
            System.out.println("total = " + total);
            System.out.println("average = " + average);
        }
    }
}
