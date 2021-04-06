package task3;

public class task3Examples {

    public static void main(String[] args) {
        /**
         * 1) Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 50 до 201?
         */
        for (int i = 50; i <= 201; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        /**
         * 2) Посчитаем сумму чисел 1, 2, …, 9
         */
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        /**
         * 3) Посчитаем сумму нескольких чётных чисел 8+10+12+14.
         */
        int sumOfEven = 0;
        for (int i = 8; i <= 14; i+=2) {
                sumOfEven += i;
        }
        System.out.println(sumOfEven);

        /**
         * 4) Посчитаем произведение 4 8 12 16 20. То есть нужно все эти числа перемножить между собой.
         */
        int[] array = new int[]{4, 8, 12, 16, 20};
        int productOfNumbers = 1;

        for (int i = 0; i < array.length; i++) {
            productOfNumbers *= array[i];
        }

        System.out.println(productOfNumbers);

        /**
         * 5) Посчитаем выражение 1-2+3-4+5-6.
         */
        int expressionOfNumbers = 0;
        for (int i = 0; i <= 6; i++) {
            if (i % 2 == 0) {
                expressionOfNumbers -= i;
            } else {
                expressionOfNumbers += i;
            }
        }
        System.out.println(expressionOfNumbers);

        /**
         6) Посчитаем значения последовательности чисел по такому правилу:
         a1 = 5,
         a2 = a1 * 3 + 1,
         a3 = a2 * 3 + 1,
         …
         a100 = a99*3 + 1.
         */
        long a = 5;
        for (int i = 1; i <= 100; i++) {
            a = a * 3 + 1;
        }
        System.out.println(a);

        /**
         * 7) Распечатайте в программе таблицу умножения чисел от 1 до 10. На экране должно получиться:
         *
         * 1 2 3 4 5 6 7 8 9
         * 2 4 6 8 10 12 14 16 18
         * 3 6 9 12 15 18 21 24 27
         * 4 8 12 16 20 24 28 32 36
         * 5 10 15 20 25 30 35 40 45
         * 6 12 18 24 30 36 42 48 54
         * 7 14 21 28 35 42 49 56 63
         * 8 16 24 32 40 48 56 64 72
         * 9 18 27 36 45 54 63 72 81
         */

        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
        }
        System.out.println();

        /**
         * 8) Распечатать символ a, так что в первой строке всего один символ,
         * во второй - два, в третьей - три, и так далее до 5.
         * Будет вот так:
         * a
         * aa
         * aaa
         * aaaa
         * aaaaa
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("a");
            }
        }
    }
}
