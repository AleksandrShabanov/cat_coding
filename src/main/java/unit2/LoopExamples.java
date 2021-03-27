package unit2;

import java.util.Arrays;
import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {

        //1.Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.Необходимо вывести на экран числа от 1 до 80, вывести толко четные
        for (int i = 1; i <= 80; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //3.Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        int i = 5;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        //4.Необходимо вывести на экран таблицу умножения на 10
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " * 10 = " + j * 10);
        }

        //6.Как сделать так, чтобы этот код печатал числа  от 70 до 201?
        for (int j = 70; j <= 201; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        //7.Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int counter = 0;
        int j = 1;

        while(counter <= 55){
            System.out.print(j + " ");
            j = j + 2;
            counter++;
        }

    }

}
