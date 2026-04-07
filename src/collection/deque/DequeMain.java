package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
ArrayDeque vs LinkedList
둘의 차이는 ArrayList와 LinkedList의 차이와 비슷하다.
작동 원리가 하나는 배열을 하나는 동적 노드 링크를 사용하기 때문이다.
ArrayDeque는 추가로 원형 큐 자료 구조를 사용하는데, 덕분에 앞, 뒤 입력 모두 O(1)의 성능을 제공한다.
물론 LinkedList도 앞, 뒤 입력 모두 O(1)의 성능을 제공한다.
이론적으로 LinkedList가 삽입 삭제가 자주 발생할 때 더 효율적일 수 있지만,
현대 컴퓨터 시스템의 메모리 접근 패턴, CPU 캐시 최적화 등을 고려할 때 배열을 사용하는 ArrayDeque가 더 나은 성능을 보여주는 경우가 많다.
*/
public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만(
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}
