package task_money;

public class MoneyTest {
    public static void main(String[] args) {
        Money rub = new Money(100);
        rub.setMoneyName("rub");

        System.out.println(rub.addition(rub,50) + " " + rub.getMoneyName());
        System.out.println(rub.subtraction(rub, 80) + " " + rub.getMoneyName());
        System.out.println(rub.division(rub, 5) + " " + rub.getMoneyName());
        System.out.println(rub.fractionalDivision(rub, 5) + " " + rub.getMoneyName());
        System.out.println(rub.multiplication(rub, 6789) + " " + rub.getMoneyName());
        System.out.println(rub.comparison(rub, 50) + " " + rub.getMoneyName());
    }
}
