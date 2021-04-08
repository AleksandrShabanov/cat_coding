package task4;

import java.util.Arrays;
import java.util.Scanner;

public class ExamplesOfArrays {
    public static void main(String[] args) {

        /**
         * 1. Написать программу, заводящую массив из 5 целых чисел, заполняющую
         * его числами, введенными с клавиатуры, и печатающую, сколько раз в этом
         * массиве встречается цифра 1.
         */

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        int number1 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] == 1) {
                number1++;
            }
        }

        System.out.println("Цифра 1 встречается в массиве: " + number1 + " раз");
        System.out.println();

        /**
         * 2. Переписать программу из предыдущего задания так, чтобы считалась сумма введенных чисел
         */

        int newArray[] = new int[5];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println();

        /**
         * 3. Дан массив натуральных чисел. Найти сумму элементов, кратных 5
         *
         * !!! Задание сделал, но во время выполнения возник вопрос.
         * Если в массиве будет несколько элементов кратных 5, как это можно
         * реализовать? !!!
         */

        int newArray2[] = {10, 5, 3, 4, 5};
        int result = 0;

        for (int i = 0; i < newArray2.length; i++) {

            if (newArray2[i] % 5 == 0) {
                result += newArray2[i];
            }

        }
        System.out.println("Сумма элементов кратных 5: " + result);

        /**
         * 4. Дан массив целых положительных чисел. Найти произведение
         * только тех чисел, которые больше заданного числа М. Если таких нет, то выдать
         * сообщение об этом.
         *
         * !!! Аналогичный прошлому вопрос !!!
         */

        int m = scanner.nextInt();
        int newArray3[] = {5, 1, 1, 3, 2};
        int multiplication = 1;
        boolean isAvailableNumberGreaterM = false;

        for (int i = 0; i < newArray3.length; i++) {
            if (newArray3[i] > m){
                multiplication *= newArray3[i];
                isAvailableNumberGreaterM = true;
            }
        }

        if (isAvailableNumberGreaterM) {
            System.out.println("Произведение чисел, которые больше " + m + ": " + multiplication);
        } else {
            System.out.println("Таких чисел нет");
        }

    }
}
