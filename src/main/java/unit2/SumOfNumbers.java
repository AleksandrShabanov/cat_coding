package unit2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        /*
        Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number > 0)
                sum += i;
        }

        if (number > 0)
            System.out.println(sum);
        else
            System.out.println("Неккоректный ввод! Введено отрицательное число.");

    }
}
