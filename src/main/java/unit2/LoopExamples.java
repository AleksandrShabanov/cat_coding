package unit2;

public class LoopExamples {

    public static void main(String[] args) {

        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Необходимо вывести на экран числа от 1 до 80, вывести толко четные
        for (int i = 1; i <= 80; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        int i = 5;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        //Необходимо вывести на экран таблицу умножения на 10
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " * 10 = " + j * 10);
        }
    }

}
