package SOLID.S.ver1_wrong;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<Animal> saveAnimal (Animal animal) {
        List<Animal> list = new ArrayList<>();
        list.add(animal);

        System.out.println(list);
        return list;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
