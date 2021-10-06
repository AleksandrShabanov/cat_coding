package task_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class IteratorTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int a = 0;
            int b = 100;

            numbers[i] = a + (int) (Math.random() * b);
        }

        System.out.println(Arrays.toString(numbers));

        CustomList customList = new CustomList(numbers);
        Iterator<Integer> iterator = customList.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
