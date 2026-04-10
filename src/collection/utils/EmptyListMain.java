package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // 자바5부터 제공되는 기능
        List<Integer> list4 = List.of(); // 자바9부터 제공되는 기능

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        // Arrays.asList()로 생성된 리스트는 고정된 크기를 가지지만, 요소들을 변경할 수 있다.
        // 즉, 리스트의 길이는 변경할 수 없지만, 기존 위치에 있는 요소들을 다른 요소들로 교체할 수 있다.
        // set()을 통해 요소를 변경할 수 있다.
        // add(), remove() 같은 메서드를 호출하면 예외가 발생한다. 크기를 변경할 수 없다.
        // java.lang.UnsupportedOperationException 예외 발생
        // 고정도 가변도 아닌 애매한 리스트이다.

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr); // 배열을 그대로 쓴다.
        arrList.set(0, 100); // arrList의 값을 바꿨는데, arr의 값까지 같이 바뀐다.
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
        List<Integer> ofList = List.of(arr); // 배열을 하나씩 돌리면서 새로운 리스트 생성
        // 엄청나게 큰 길이의 배열을 이용할 때, asList()를 통해서 바로 가져다 쓸 수 있어서 비용이 적게 들어가서 성능이 더 좋다.
        // 그러나 대부분의 경우 List.of()를 권장한다.
    }
}
