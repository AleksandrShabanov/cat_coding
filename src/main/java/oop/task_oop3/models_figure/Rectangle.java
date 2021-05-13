package oop.task_oop3.models_figure;

public class Rectangle extends Figure {

    @Override
    public double getArea() {
        return getA() * getB();
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB()) * 2;
    }
}
