package sec10.ex.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        // 별도의 비교자가 없으므로 Comparable 비교해서 정렬, 자연적인 순서로 비교
        list.sort(null); // 아래 방법보다 객체 자체 정렬 메서드 사용 권장
//        Collections.sort(list); //
        System.out.println(list);

        System.out.println("IDComparator 정렬");
        list.sort(new IdComparator());
//        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
