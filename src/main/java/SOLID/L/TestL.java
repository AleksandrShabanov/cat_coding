package SOLID.L;

import SOLID.L.models.Animal;
import SOLID.L.models.Lion;
import SOLID.L.models.Mouse;
import SOLID.L.models.Snake;

public class TestL {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Snake(),
                new Mouse()
        };

        animalLegCount(animals);
    }

    public static void animalLegCount(Animal[] animals) {
        for (Animal a : animals) {
            a.legCount();
        }
    }
}
