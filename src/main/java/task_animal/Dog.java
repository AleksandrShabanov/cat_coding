package task_animal;

public class Dog extends Animal{
    private boolean friendOfHuman;
    private String tailLength;

    public Dog(String food, String location, boolean friendOfHuman, String tailLength) {
        super(food, location);
        this.friendOfHuman = friendOfHuman;
        this.tailLength = tailLength;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет кость");
    }

    @Override
    public String toString() {
        return "Собака";
    }
}
