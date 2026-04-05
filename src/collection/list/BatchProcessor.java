package collection.list;

public class BatchProcessor {

    // 구체적인 것에 의존하지 않고,
    // private final MyArrayList<Integer> list = new MyArrayList<>();
    // private final MyLinkedList<Integer> list = new MyLinkedList<>();
    // 아래처럼 추상적인 것에 의존해라.
    private final MyList<Integer> list;

    // 그리고 생성자를 통해서 구체적인 인스턴스를 주입 받아라.
    // 밖에서 나중에 결정해서 주입 받아라 -> 의존관계 주입
    // MyList = new MyArrayList
    // MyList = new MyLinkedList
    public  BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < size ; i++) {
            list.add(0, i); // 리스트의 앞에 데이터 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
