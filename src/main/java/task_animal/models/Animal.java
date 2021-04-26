package task_animal.models;

public class Animal {
    private String food;
    private String location;

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public void eat() {

    }

    public void sleep() {

    }

}
