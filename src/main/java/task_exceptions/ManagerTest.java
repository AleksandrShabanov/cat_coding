package task_exceptions;

import task_exceptions.models.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.correctEmployeeAge());
        System.out.println(manager.correctEmployeeFullName());
        System.out.println(manager.correctEmployeeCountry());
    }
}
