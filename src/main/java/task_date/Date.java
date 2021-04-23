package task_date;

import java.util.Calendar;
import java.util.Locale;

/**
 *  a) Создать класс Date, который имеет следующие поля:
 *         - day (день)
 *         - month (месяц)
 *         - year (год)
 *
 *         Все поля должны быть помечены модификатором private
 *
 *         - реализовать конструкторы:
 *             public Date() // инициировать 1 января 1970
 *             public Date(int day, int month, int year)
 *             public Date(Date date) (конструктор копирования)
 *
 *         - реализовать возможность установки нового значения времени с помощью методов:
 *             set(int day, int month, int year);
 *             set(Date date);
 *             в первом случае проверять корректность полей: day, month, year
 *
 *         - реализовать методы:
 *             int getDay();
 *             int getMonth();
 *             int getYear();
 *                 которые возвращают день, месяц и год, соответственно
 *
 *         -* реализовать методы:
 *             String getDayOfWeek();
 *                 который возвращает день недели: пн, вт, ср и тд.
 *             int getWeekOfYear();
 *                 которые вычисляет номер недели в году
 *
 *         - реализовать методы:
 *             nextDay();
 *             nextMonth();
 *             nextYear();
 *             которые увеличивают на единицу значение дня, месяца и года соответственно
 */

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void set(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }


    public String getDayOfWeek() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);

        return dayOfWeek;
    }

    public int getWeekOfYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        cal.setMinimalDaysInFirstWeek(1);

        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public void nextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        int numDays = calendar.getActualMaximum(Calendar.DATE);

        day++;

        if (day > numDays){
            day = 1;
            nextMonth();
        }
        if (day == 1 && month == Calendar.JANUARY){
            nextYear();
        }

        System.out.println("Метод nextDay: " + day + " " + month + " " + year);
    }

    public void nextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        int numMonth = calendar.getActualMaximum(Calendar.MONTH);

        month++;

        if (month > numMonth){
            month = 0;
        }
    }

    public void nextYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);

        year++;
    }

    @Override
    public String toString() {
        return "Дата: " + day + " " + month + " " + year;
    }
}
