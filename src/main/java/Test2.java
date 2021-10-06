public class Test2 {
    public static void main(String[] args) {

        int num = 123;

        System.out.println(reverse(num));
    }

    public static int reverse(int x) {

        long reversed = 0;
        while (x != 0) {
            long digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if (reversed > Math.pow(-2, 31) && reversed < Math.pow(2, 31) - 1) {
            return (int) reversed;
        }
        return 0;
    }
}

