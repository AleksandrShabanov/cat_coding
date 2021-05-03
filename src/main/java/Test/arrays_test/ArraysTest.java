package Test.arrays_test;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int array[] = new int[]{20, 0, 100, -17, 5};
        int arrayCopy [] = array.clone();

        System.out.println(Arrays.toString(arrayCopy));

    }

}
