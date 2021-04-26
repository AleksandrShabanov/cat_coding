package task_animal.test;

import task_animal.models.Cat;
import task_animal.models.Dog;
import task_animal.models.Horse;
import task_animal.models.Vet;

/**
 * 4 задачка
 * ===========
 *
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Метод makeNoise, например, может выводить на консоль "Такое-то животное мурчит".
 *
 * Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse,
 * характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив типа Animal,
 * в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
 */
public class AnimalTest {
    public static void main(String[] args) {
        Horse horse = new Horse("сено", "прерии",  "Черная и длинная", 4);
        Dog dog = new Dog("косточки", "домашнее животное", "Длинный хвост", true);
        Cat cat = new Cat("сухой корм", "домашнее животное", true, 7);

        Vet vet = new Vet();
        vet.treatAnimal(horse);
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
    }
}
