package Test;

public class Task3 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 5, 10};

        int sum = 0;
        for (int i = 1; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

        /**
         * четная строчка = 2 ячейки матрицы
         * нечетная = 1 ячейка
         * 0
         * 0 0
         * 0
         * 0 0
         */

        int [][] matrix = new int[5][];

        for (int i = 0; i < matrix.length; i++){
            if (i % 2 == 0){
                matrix[i] = new int[2];
            }
            else {
                matrix[i] = new int[1];
            }

            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }



    }
}
