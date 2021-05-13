package oop.task_oop3.models_figure;

public class Triangle extends Figure {

    @Override
    public double getArea() {
        double pp = (getA() + getB() + getC()) / 2.0;
        double result = Math.sqrt(pp * (pp - getA()) * (pp - getB()) * (pp - getC()));
        return result;
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }
}
