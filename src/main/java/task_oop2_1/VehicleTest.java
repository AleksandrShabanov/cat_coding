package task_oop2_1;

import task_oop2_1.models.Car;
import task_oop2_1.models.Ship;
import task_oop2_1.models.Truck;
import task_oop2_1.models.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Красный");
        vehicle.print();
        System.out.println();
        vehicle = new Car("черный", "Kia");
        vehicle.print();
        System.out.println();
        vehicle = new Truck("белый", "Mercedes", 1.3);
        vehicle.print();
        System.out.println();
        vehicle = new Ship("белый", 80);
        vehicle.print();

    }
}
