package task2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        /**
        5.Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Введено отрицательное число");
            return;
        }
        int sum = 0;

        for (int i = 1; i <= number; i++) {
                sum += i;
        }

        System.out.println(sum);
    }
}
