package task_oop2_1.models;

public class Truck extends Car{

    private double maxLoad;

    public Truck(String color, String manufacturer, double maxLoad) {
        super(color, manufacturer);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Макс загрузка: "
                + getMaxLoad() + " тонны");
    }
}
