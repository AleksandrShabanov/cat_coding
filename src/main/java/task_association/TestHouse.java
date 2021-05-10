package task_association;

import task_association.models_house.Furniture;
import task_association.models_house.House;

public class TestHouse {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();

        House oldHouse = new House(2, furniture);
        House newHouse = new House(5, furniture);

        System.out.println(oldHouse);
        System.out.println(newHouse);
    }
}
