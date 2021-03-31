package task2;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static void main(String[] args) {

        /*Сгенерировать число int n = ThreadLocalRandom.current().nextInt();
        и если оно четное - вывести в консоль "Число четное", если нечетное - то фразу "Число нечетное"
         */

        int n = ThreadLocalRandom.current().nextInt();

        if (n % 2 == 0) {
            System.out.println("Число четное: " + n);
        }
        else {
            System.out.println("Число нечетное: " + n);
        }

    }
}
