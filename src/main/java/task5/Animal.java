package task5;

/**
 * Животное
 *
 * характеристики/атрибуты
 * - имя
 * - цвет
 * - возраст
 *
 * функциональность
 * - бегать
 * - есть
 * - спать
 */
public class Animal {
    private String name;
    private String color;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println(name + " runs");
    }

    public void eat(){
        System.out.println(name + " eats");
    }

    public void sleep(){
        System.out.println(name + " sleeps");
    }
}
