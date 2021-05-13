package oop.task_oop3;

import oop.task_oop3.models_figure.Circle;
import oop.task_oop3.models_figure.Figure;
import oop.task_oop3.models_figure.Rectangle;
import oop.task_oop3.models_figure.Triangle;

public class TestFigure {
    public static void main(String[] args) {
        Figure triangle = new Triangle();
        triangle.setA(20);
        triangle.setB(20);
        triangle.setC(10);

        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        Figure rectangle = new Rectangle();
        rectangle.setA(20);
        rectangle.setB(10);

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника : " + rectangle.getPerimeter());

        Figure circle = new Circle();
        if (circle instanceof  Circle){
            ((Circle) circle).setRadius(20);
        }

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getPerimeter());
    }
}
