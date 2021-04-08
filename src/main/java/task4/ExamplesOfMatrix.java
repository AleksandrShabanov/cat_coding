package task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamplesOfMatrix {
    public static void main(String[] args) {
        /**
         * 1 Дан целочисленный массив X[5, 4]. Заполнить рендомно.
         *   Заменить в нем все элементы, меньшие 5 числом 111.
         */
        Random random = new Random();

        int x[][] = new int[5][4];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = random.nextInt(20) + 1;

                if (x[i][j] < 5) {
                    x[i][j] = 111;
                }

                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /**
         * 2 Дан целочисленный рендомный массив В[4,3].
         *   Заменить все его элементы их квадратами.
         */

        int b[][] = new int[4][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = square(random.nextInt(20) + 1);
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /**
         * 3 Дан действительный рендомный массив А[5, 3].
         * Напечатать индексы его отрицательных элементов.
         */

        double a[][] = new double[5][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (-10) + (20 - (-10)) * random.nextDouble();

                if (a[i][j] < 0) {
                    System.out.println("Строка: " + i + " Индекс отрицательного элемента: " + j);
                }
            }
        }
        System.out.println();

        /**
         * 4 Создайте двумерный рендомный целочисленный массив А[10, 7]
         * и найдите сумму всех его элементов, имеющих оба нечетных индекса.
         */

        int matrix[][] = new int[10][7];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20) + 1;

                if (i % 2 != 0) {
                    if (matrix[i][j] % 2 != 0) {
                        sum += matrix[i][j];
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма нечетных элементов: " + sum);
        System.out.println();

        /**
         * 5 Введите с клавиатуры целочисленные элементы матрицы 3*3
         * и вычислите сумму элементов каждого столбца.
         */

        Scanner scanner = new Scanner(System.in);
        int newMatrix[][] = new int[3][3];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = scanner.nextInt();
                if (i == 0) {
                    sum1 += newMatrix[i][j];
                } else if (i == 1) {
                    sum2 += newMatrix[i][j];
                } else if (i == 2) {
                    sum3 += newMatrix[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(newMatrix));
        System.out.println("Сумма элементов первого столбца: " + sum1);
        System.out.println("Сумма элементов второго столбца: " + sum2);
        System.out.println("Сумма элементов третьего столбца: " + sum3);
        System.out.println();

        /**
         * 6 Дан целочисленный рендомный массив В[5, 5]
         * Напечатать его левую и правую диагонали
         *
         * Не нашел, что такео левая и правая диагональ матрицы,
         * поэтому вывел главную и побочную
         */

        int newMatrix2[][] = new int[5][5];

        for (int i = 0; i < newMatrix2.length; i++) {
            for (int j = 0; j < newMatrix2[i].length; j++) {
                newMatrix2[i][j] = random.nextInt(9) + 1;
                System.out.print(newMatrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Главная диагональ матрицы: " + newMatrix2[0][0] + " " + newMatrix2[1][1] + " " + newMatrix2[2][2] + " "
                + newMatrix2[3][3] + " " + newMatrix2[4][4]);
        System.out.print("Побочная диагональ матрицы: " + newMatrix2[4][0] + " " + newMatrix2[3][1]
                + " " + newMatrix2[2][2] + " " + newMatrix2[1][3] + " " + newMatrix2[0][4]);


    }

    public static int square(int a) {
        int result = a * a;
        return result;
    }
}
