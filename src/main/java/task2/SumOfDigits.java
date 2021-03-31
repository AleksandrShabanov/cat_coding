package task2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        /*
       8.Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
        (заранее не известно сколько цифр будет в числе).
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
