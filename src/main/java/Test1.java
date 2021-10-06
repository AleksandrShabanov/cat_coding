import java.util.*;


public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int[] nums = {2, 3, 4};

        int result = 0;

        for (int m : nums) {

            result += m;

        }

        System.out.println(result);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        sortArray2(arr);


    }

    public static void reverseInt(Integer num) {

    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
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




