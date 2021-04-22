package task_date;

import java.util.Calendar;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(22, Calendar.APRIL, 2021);

        System.out.println("День недели: " + date.getDayOfWeek());
        System.out.println("Номер недели: " + date.getWeekOfYear());

        date.set(31, Calendar.DECEMBER, 2020);

        System.out.println("День недели: " + date.getDayOfWeek());
        System.out.println("Номер недели: " + date.getWeekOfYear());
        date.nextDay();

    }
}
