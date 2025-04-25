package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] backets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        backets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            backets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> backet = backets[hashIndex];
        if (backet.contains(value)) {
            return false;
        }
        backet.add(value);
        size++;
        return true;
    }

    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> backet = backets[hashIndex];
        return backet.contains(value);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> backet = backets[hashIndex];
        boolean result = backet.remove(Integer.valueOf(value));
        if (!result) {
            return false;
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "backets=" + Arrays.toString(backets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
