package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBucket();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0 ; i < capacity ; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(Integer.valueOf(value));
        // remove는 숫자를 넘기면 index 기준으로 지워버림. 그래서 Object 타입으로 넘겨야 한다.
        // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
