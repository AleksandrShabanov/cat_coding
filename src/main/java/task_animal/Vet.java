package task_animal;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println(animal + " кушает: " + animal.getFood() + "; локация: " + animal.getLocation());
    }
}
