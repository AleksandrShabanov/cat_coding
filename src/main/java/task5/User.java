package task5;

/**
 * Пользователь
 * <p>
 * характеристики/атрибуты
 * - имя
 * - фамилия
 * - никнейм
 * - возраст
 * - место жительства
 * <p>
 * функциональность
 * - работать
 * - есть
 * - спать
 */
public class User {
    private String name;
    private String surname;
    private String nickname;
    private int age;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void doWork() {
        System.out.println(name + " " + surname + " with nickname " + nickname + " works");
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }
}