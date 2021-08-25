package task_serializable.models;

import java.io.Serializable;

/**
 * Разберись
 *  1.1) что это такое
 *  1.2) что такое serialVersionUid - разбери с примером
 *   -- запиши сначала в файл объект с 3 полями(сериализуй)
 *   -- потом попробуй поменять модель - добавь или убери поле
 *   -- попробуй десериализовать - то-есть по сути ты сохранил модель объекта которая уже устарела,
 *   тк ты в пункте 2 поменял поля(добавил или убрал); разберись как на такие кейсы влияет serialVersionUid
 */

public class Human implements Serializable {
    private String name;
//    private String surname;
    private int age;
    private String profession;
    private static final long serialVersionUID = -5343142677829708586L;

    public Human(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
