package task_animal.models;

public class Dog extends Animal{
    private boolean isFriendOfHuman;
    private String tailLength;

    public Dog(String food, String location, String tailLength, boolean isFriendOfHuman) {
        super(food, location);
        this.isFriendOfHuman = isFriendOfHuman;
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
        return "Собака " +
                "друг человека: " + isFriendOfHuman +
                ", длина хвоста: " + tailLength + ";";
    }
}
