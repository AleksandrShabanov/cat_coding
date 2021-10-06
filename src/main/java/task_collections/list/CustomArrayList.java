package task_collections.list;

import java.util.Arrays;

public class CustomArrayList {
    private Object[] elementData;
    private int capacity = 10;
    private int currentSize = 0;

    public CustomArrayList() {
        elementData = new Object[capacity];
    }

    public void add(Object newElement) {
        ensureCapacity(currentSize + 1);
        elementData[currentSize++] = newElement;
    }

    public boolean remove(Object o) {

        return false;
    }

    private void ensureCapacity(int newIndex) {
        if (newIndex > elementData.length) {
            int newLength = 3 * elementData.length / 2 + 1;
            elementData = Arrays.copyOf(elementData, newLength);
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", capacity=" + capacity +
                ", currentSize=" + currentSize +
                '}';
    }
}
