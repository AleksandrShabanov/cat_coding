package Test;

public class Task1 {
    public static void main(String[] args) {
        /**
         * int c = ?
         * если a > b тогда с = 10
         * если a > 7 и b > 5 тогда с = -1
         * если a = b тогда с = 3
         */

        int a = 15;
        int b = 7;
        int c = a > b ? (10) : (a > 7 && b > 5 ? -1 : (a == b ? 3 : 0));


        if (a > b) {
            c = 10;
        }
        else if (a > 7 && b > 5) {
            c = -1;
        }
        else if (a == b) {
            c = 3;
        }

        System.out.println(c);
    }
}
