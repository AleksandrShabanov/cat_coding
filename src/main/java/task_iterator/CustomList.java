package task_iterator;

import java.util.Iterator;

public class CustomList<T> implements Iterable {
    private int[] arrayList;
    private int currentSize;

    public CustomList(int[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new Iterator<Integer>() {

            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < currentSize && arrayList[cursor] != 0;
            }

            @Override
            public Integer next() {
                return arrayList[cursor++];
            }

            @Override
            public void remove() {
            }
        };
        return iterator;
    }

}
