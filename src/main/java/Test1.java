import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.round;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        searchElement(arr, 10);
    }

    public static void searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] == element) {
                 System.out.println(element + " found at index " + i);
             }
        }
    }



    public static class Singleton {
        private Singleton instance;

        private Singleton() {
        }

        public Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}




