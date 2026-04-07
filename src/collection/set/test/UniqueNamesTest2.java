package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 배열을 리스트로 변환하는 방법
        // 자바9부터는 List.of()를 권장한다.
        List<Integer> list = List.of(inputArr);
        List<Integer> list2 = Arrays.asList(inputArr);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);

        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
