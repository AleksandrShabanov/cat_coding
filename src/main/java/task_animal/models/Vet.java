package task_animal.models;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println(animal + " кушает: " + animal.getFood() + "; локация: " + animal.getLocation());
    }
}
