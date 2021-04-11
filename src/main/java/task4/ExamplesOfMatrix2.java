package task4;

import java.util.Scanner;

public class ExamplesOfMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int matrix[][] = new int[n][];

        for (int i = 0; i < matrix.length; i++){
            matrix[i] = new int[i + 1];
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i + 1;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
