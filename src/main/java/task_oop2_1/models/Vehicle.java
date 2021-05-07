package task_oop2_1.models;

public class Vehicle {

    private String color;
    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.print(" -> это транспортное средство");
    }
}
