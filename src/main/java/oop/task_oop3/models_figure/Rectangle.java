package oop.task_oop3.models_figure;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB()) * 2;
    }
}
