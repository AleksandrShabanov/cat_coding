package task_reflection.models;

/**
 *
 2) создай модель User, определи 2 приватных поля, и 2 конструктора: с параметрами и без
 2.1) создай объект типа User с помощью рефлексии
 2.2) поменяй каждое из полей на какие-либо новые значения посредством рефлексии
 */

public class User {
    private String name;
    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
