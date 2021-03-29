package unit2;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        //10.Используя цикл for написать фрагмент кода, который находит сумму для заданного n: 5 + 10 + 15 + … + 5·n
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int k = 5; k <= number * 5; k += 5){
            sum += k;
        }

        System.out.print(sum);
    }
}
