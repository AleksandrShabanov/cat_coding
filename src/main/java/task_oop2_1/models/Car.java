package task_oop2_1.models;

public class Car extends Vehicle {

    private String manufacturer;

    public Car(String color, String manufacturer) {
        super(color);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void print() {
        System.out.print("Автомобиль " + getColor() + " Производитель: " + getManufacturer());
        super.print();
    }
}
