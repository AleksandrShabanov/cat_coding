package task5;

/**
 * 2) Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит"(фамилия/возраст).
 * <p>
 * Создайте два объекта этого класса. (psvm)
 */

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + ", возраст: " + age + " Куда-то идет.");
    }

    public void talk() {
        System.out.println(fullName + ", возраст: " + age + " Что-то говорит.");
    }
}
