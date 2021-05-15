package oop.task_oop3.models_figure;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getArea() {
        double pp = (getA() + getB() + c) / 2.0;
        return Math.sqrt(pp * (pp - getA()) * (pp - getB()) * (pp - c));
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + c;
    }
}
