package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private double weight;

    Driver driver = new Driver();
    Engine turboEngine = new Engine();

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void printInfo(Driver driver, Engine turboEngine){
        System.out.println("Водитель: " + driver.getName() + " " + driver.getSurname() + " со стажем вождения: " +
                driver.getDrivingExperience() + " лет. " + " За рулем автомобиля: \n" + carBrand + " " + carClass + " класса " +
                ", который весит: " + weight + ". Мощность двигателя: " + turboEngine.getPower() + " л/с. " + " Производитель двигателя: " +
                turboEngine.getProducer());
    }
}
