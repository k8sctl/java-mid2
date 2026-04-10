package collection.compare;

import java.util.ArrayList;
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
        // Collections.sort(list);
        list.sort(null);
        System.out.println(list); // MyUser 클래스에 구현한 기본 정렬을 따른다. (age 기준)

        System.out.println("IdComparator 정렬");
        // Collections.sort(list, new IdComparator());
        list.sort(new IdComparator());
        System.out.println(list); // IdComparator의 정렬 기준을 따른다. (id 기준)
    }
}
