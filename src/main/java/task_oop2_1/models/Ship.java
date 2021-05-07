package task_oop2_1.models;

public class Ship extends Vehicle{

    private int length;

    public Ship(String color, int length) {
        super(color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void print() {
        System.out.print("Корабль: " + getColor() + " Длина: " + getLength());
        super.print();

    }
}
