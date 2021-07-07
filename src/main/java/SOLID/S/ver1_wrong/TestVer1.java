package SOLID.S.ver1_wrong;

import SOLID.S.ver1_wrong.Animal;
import SOLID.S.ver1_wrong.models.Dog;
import SOLID.S.ver1_wrong.models.Horse;
import SOLID.S.ver1_wrong.models.Turtle;

public class TestVer1 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Sharik"), new Horse("Igo-go"), new Turtle("Leonardo")};

        for (int i = 0; i < animals.length; i++) {
            Animal.saveAnimal(animals[i]);
        }

    }
}
