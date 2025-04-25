package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Object>[] backets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        backets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            backets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> backet = backets[hashIndex];
        if (backet.contains(value)) {
            return false;
        }
        backet.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> backet = backets[hashIndex];
        return backet.contains(value);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> backet = backets[hashIndex];
        boolean result = backet.remove(value);
        if (!result) {
            return false;
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    private int hashIndex(Object value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "backets=" + Arrays.toString(backets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
