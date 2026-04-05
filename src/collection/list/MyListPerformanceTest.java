package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 추가 ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);  // 찾는데 O(1), 데이터 추가(밀기) O(n)
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); // 찾는데 O(1), 데이터 추가 O(1)

        int loop = 10_000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0); // 앞에서 조회
        getIndex(arrayList, loop, size / 2); // 중간에서 조회
        getIndex(arrayList, loop, size - 1); // 뒤에서 조회

        System.out.println("== MyArrayList 검색 ==");
        search(arrayList, loop, 0); // 앞에서 검색
        search(arrayList, loop, size / 2); // 중간에서 검색
        search(arrayList, loop, size - 1); // 뒤에서 검색

        System.out.println("== MyLinkedList 추가 ==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);  // 찾는데 O(n), 데이터 추가 O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size); // 찾는데 O(n), 데이터 추가 O(1)

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0); // 앞에서 조회
        getIndex(linkedList, loop, size / 2); // 중간에서 조회
        getIndex(linkedList, loop, size - 1); // 뒤에서 조회

        System.out.println("== MyLinkedList 검색 ==");
        search(linkedList, loop, 0); // 앞에서 검색
        search(linkedList, loop, size / 2); // 중간에서 검색
        search(linkedList, loop, size - 1); // 뒤에서 검색

    }

    // 리스트의 맨 앞에 0 ~ size까지 size만큼 숫자를 계속 넣는다.
    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < size ; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 가운데에 추가
    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < size ; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 뒤에 추가
    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < size ; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 조회
    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < loop ; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 검색
    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < loop ; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
