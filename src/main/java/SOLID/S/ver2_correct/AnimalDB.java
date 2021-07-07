package SOLID.S.ver2_correct;

import SOLID.S.ver2_correct.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDB {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public List<Animal> saveAnimal(Animal animal) {
        List<Animal> list = new ArrayList<>();
        list.add(animal);

        System.out.println(list);
        return list;
    }
}
