package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class TestDrive {
    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.setName("Michael");
        driver.setSurname("Schumacher");
        driver.setDrivingExperience(35);

        Engine engine = new Engine();
        engine.setPower(122);
        engine.setProducer("BlueMotion");

        Car golf7 = new Car();
        golf7.setDriver(driver);
        golf7.setTurboEngine(engine);
        golf7.setCarBrand("VW Golf 7");
        golf7.setCarClass("Golf class");
        golf7.setWeight(1238);

        golf7.printInfo();
    }
}
