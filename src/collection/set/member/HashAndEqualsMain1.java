package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashhNoEq m1 = new MemberNoHashhNoEq("A");
        MemberNoHashhNoEq m2 = new MemberNoHashhNoEq("A");
        // 참조값을 기준으로 작동
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashhNoEq searchValue = new MemberNoHashhNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
