package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<E>[] backets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        backets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            backets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> backet = backets[hashIndex];
        if (backet.contains(value)) {
            return false;
        }
        backet.add(value);
        size++;
        return true;
    }

    public boolean contains(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> backet = backets[hashIndex];
        return backet.contains(value);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> backet = backets[hashIndex];
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

    private int hashIndex(E value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "backets=" + Arrays.toString(backets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
