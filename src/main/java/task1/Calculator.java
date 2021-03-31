package task1;

public class Calculator {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        System.out.println(calc.getSum(1, 4));
        System.out.println(calc.getMinus(2,2));
        System.out.println(calc.getDivision(20,2));
        System.out.println(calc.getMultiplication(5,5));
    }

    public int getSum(int param1, int param2) {
        return param1 + param2;
    }

    public int getMinus(int param1, int param2){
        return param1 - param2;
    }

    public int getDivision(int param1, int param2){
        try {
            return param1 / param2;
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль.");
        }
        return param1 / param2;
    }

    public int getMultiplication(int param1, int param2){
        return param1 * param2;
    }
}
