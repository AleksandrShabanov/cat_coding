package oop.task_oop3.models_figure;

public abstract class Figure {

    private double a, b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure() {

    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
