package task_oop2;

import task_oop2.hen_models.*;

import java.util.Scanner;

/**
 * 1. Создать класс Hen
 * 1.2. Добавить в класс  метод  int getCountOfEggsPerMonth()
 * 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
 *
 * 2. Создать класс RussianHen, который наследуется от Hen
 * 3. Создать класс UkrainianHen, который наследуется от Hen
 * 4. Создать класс MoldovanHen, который наследуется от Hen
 * 5. Создать класс BelarusianHen, который наследуется от Hen
 *
 * 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
 * Методы должны возвращать количество яиц в месяц от данного типа куриц.
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 * Методы должны возвращать строку вида:
 * <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
 * где SSSSS - название страны
 * где N - количество яиц в месяц
 *
 * 8. Запрашивая страну у юзера - выводить курицу определенного типа
 * - количество яиц
 * - полный дескрипшн
 * 9. Все созданные вами классы должны быть в отдельных файлах
 * для решения задачи посмотри в сторону
 * https://refactoring.guru/ru/design-patterns/factory-method
 * вместо строк для свитч - можно использовать enum
 *
 * enum HenType {
 *    UKRAINE, MOLDAVIA, ....
 * }
 */

public class HenTest {
    public static void main(String[] args) {

        System.out.println(createHen().getDescription());

    }

    public static Hen createHen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название страны: ");
        String country = scanner.nextLine();

        switch (HenType.getCountry(country)) {
            case RUSSIA:
                return new RussianHen(367);
            case BELARUS:
                return new BelarusianHen(324);
            case UKRAINE:
                return new UkrainianHen(453);
            case MOLDAVIA:
                return new MoldovanHen(345);
        }

        return null;
    }
}
