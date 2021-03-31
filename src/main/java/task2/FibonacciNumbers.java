package task2;

import java.util.Arrays;

public class FibonacciNumbers {

    public static void main(String[] args) {
        /* 9.Выведите на экран первые 11 членов последовательности Фибоначчи.
        Напоминаем, что первый и второй члены последовательности равны единицам,
        а каждый следующий — сумме двух предыдущих.
         */

        int[] number = new int[11];
        number[0] = 1;
        number[1] = 1;

        for (int i = 2; i < number.length; i++) {
            number[i] = number[i - 1] + number[i - 2];
        }
        System.out.println(Arrays.toString(number));
    }
}
