package oop.task_oop3;

import oop.task_oop3.models_figure.Circle;
import oop.task_oop3.models_figure.Figure;
import oop.task_oop3.models_figure.Rectangle;
import oop.task_oop3.models_figure.Triangle;

/**
 * 1) Сделайте иерархию по геометрическим фигурам(базовый класс фигура)
 * абстрактные методы вычисления площади/периметра и конкретные классы треугольник, прямоугольник и т.д.
 */

public class TestFigure {
    public static void main(String[] args) {
        Figure triangle = new Triangle(20, 20, 10);

        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        Figure rectangle = new Rectangle(20, 10);

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
