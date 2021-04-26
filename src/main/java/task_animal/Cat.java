package task_animal;

public class Cat extends Animal{
    private boolean acuteEyesight;
    private int nineLives;

    public Cat(String food, String location, boolean acuteEyesight, int nineLives) {
        super(food, location);
        this.acuteEyesight = acuteEyesight;
        this.nineLives = nineLives;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест сухой корм");
    }

    @Override
    public String toString() {
        return "Кошка";
    }
}
