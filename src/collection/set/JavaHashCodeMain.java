package collection.set;

import collection.set.member.Member;

import java.util.Objects;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1 = " + obj1);
        System.out.println(Integer.toHexString(obj1.hashCode()));

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("\"A\".hashCode() = " + strA.hashCode());
        System.out.println("\"AB\".hashCode() = " + strB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 다를까?, 인스턴스는 다르지만, equals()는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals(), hashCode()를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2)); // 인스턴스가 다르기 때문에 참조값이 다르다.
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); // equals()를 id를 비교하도록 오버라이딩했다.
        // hashCode()를 id를 기준으로 오버라이딩했다.
        // 오버라이딩 하지 않으면 인스턴스의 참조값을 기준으로 동작한다.
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
