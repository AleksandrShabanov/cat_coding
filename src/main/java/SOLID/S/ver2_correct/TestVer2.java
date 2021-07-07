package SOLID.S.ver2_correct;

import SOLID.S.ver2_correct.models.Animal;
import SOLID.S.ver2_correct.models.Cat;
import SOLID.S.ver2_correct.models.Cow;
import SOLID.S.ver2_correct.models.Dog;

import java.util.ArrayList;
import java.util.List;

public class TestVer2 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik"), new Dog("Bobik"), new Cow("Burenka")};
        AnimalDB animalDB = new AnimalDB();

        for (int i = 0; i < animals.length; i++) {
            animalDB.saveAnimal(animals[i]);
        }
    }
}
