package oop.task_oop3.models_figure;

public class Circle extends Figure{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
