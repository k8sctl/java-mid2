package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        System.out.print("ArrayList: ");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(arrayList);
        processor.logic(50_000);

        System.out.print("LinkedList: ");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(linkedList);
        processor2.logic(50_000);
    }
}
