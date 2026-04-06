package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBucket();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0 ; i < capacity ; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(value);
        // remove는 숫자를 넘기면 index 기준으로 지워버림. 그래서 Object 타입으로 넘겨야 한다.
        // O(n) -> 그러나 평균적으로는 O(1)에 가깝다.
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    private int hashIndex(Object value) {
        // int hashCode = value.hashCode();
        // int hashIndex = Math.abs(hashCode) % capacity; // hashCode가 음수가 나올 수 있기 때문에, 절대값으로 변경
        // return hashIndex;
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
