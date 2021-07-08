package SOLID.O;

import SOLID.O.models.Animal;
import SOLID.O.models.Cat;
import SOLID.O.models.Dog;
import SOLID.O.models.Horse;

public class TestAnimalSound {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Horse()};
        animalSound(animals);
    }

    public static void animalSound(Animal[] animals) {
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
