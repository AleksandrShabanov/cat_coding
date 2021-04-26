package task_animal.models;

public class Horse extends Animal{
    private int hooves;
    private String mane;

    public Horse(String food, String location, String mane, int hooves) {
        super(food, location);
        this.hooves = hooves;
        this.mane = mane;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест сено");
    }

    @Override
    public String toString() {
        return "Лощадь " +
                "Копыта: " + hooves +
                ", грива: " + mane + ";";
    }
}
