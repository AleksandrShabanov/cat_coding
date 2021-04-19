package task_money;

/**
 * Класс Деньги/Валюта для работы с денежными суммами.
 * Число должно быть представлено 2 полями: типа long для хранения суммы и типа String - для хранения названия валюты.
 * Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
 * умножение на дробное число и операции сравнения. В функции main проверить эти методы.
 */
public class Money {

    private long sum;
    private String moneyName;

    Money(long sum) {
        this.sum = sum;
    }

    Money() {
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getMoneyName() {
        return moneyName;
    }

    public void setMoneyName(String moneyName) {
        this.moneyName = moneyName;
    }

    @Override
    public String toString() {
        return "Результат: " + sum;
    }

    public Money addition(Money money, long l) {
        Money newMoney = new Money();
        newMoney.setSum(money.getSum() + l);

        return newMoney;
    }

    public Money subtraction(Money money, long l) {
        Money newMoney = new Money();
        newMoney.setSum(money.getSum() - l);

        return newMoney;
    }

    public Money division(Money money, long l) {
        Money newMoney = new Money();
        newMoney.setSum(money.getSum() / l);

        return newMoney;
    }

    public Money fractionalDivision(Money money, double d) {
        Money newMoney = new Money();
        newMoney.setSum((long) (money.getSum() / d));

        return newMoney;
    }

    public Money multiplication(Money money, double d) {
        Money newMoney = new Money();
        if (money.getSum() == 0 || d == 0) {
            throw new ArithmeticException();
        } else {
            newMoney.setSum((long) (money.getSum() * d));
        }

        return newMoney;
    }

    public Money comparison(Money money, long l) {
        Money newMoney = new Money();

        if (money.getSum() > l) {
            newMoney.setSum(money.getSum());
        } else {
            newMoney.setSum(l);
        }
        return newMoney;
    }

}
