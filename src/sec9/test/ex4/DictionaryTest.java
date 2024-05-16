package sec9.test.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        // 단어 입력 단계
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("단어 입력 단계");
        while (true){
            System.out.print("영어 단어 입력(종료는 'q' ) : ");
            String enInput = sc.nextLine();

            if (enInput.equals("q")){
                break;
            }

            System.out.print("한글 뜻 입력(종료는 'q' : ");
            String krInput =sc.nextLine();

            map.put(enInput, krInput);
        }

        System.out.println("단어 검색 단계");
        while (true){
            System.out.print("찾을 영어 단어 입력(종료는 'q' ) : ");
            String enFind = sc.nextLine();

            if (enFind.equals("q")){
                break;
            }

            if (!map.containsKey(enFind)){
                System.out.println(enFind + "은(는) 사전에 없는 단어입니다");
            }else {
                System.out.println(enFind + "의 뜻은 " + map.get(enFind));

            }

        }



        // 단여 검색 단계
    }
}
