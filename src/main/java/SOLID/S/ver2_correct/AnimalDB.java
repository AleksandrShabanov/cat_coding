package SOLID.S.ver2_correct;

import SOLID.S.ver2_correct.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDB {
    private Animal animal;
    private  List<Animal> DB_Animals = new ArrayList<>();

    public Animal getAnimal() {
        return animal;
    }

    public  List<Animal> getDB_Animals() {
        return DB_Animals;
    }

    public List<Animal> saveAnimal(Animal animal) {
        DB_Animals.add(animal);

        System.out.println(DB_Animals);
        return DB_Animals;
    }
}
