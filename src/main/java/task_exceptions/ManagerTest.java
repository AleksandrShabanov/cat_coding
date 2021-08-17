package task_exceptions;

import task_exceptions.models.Employee;
import task_exceptions.models.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee developer = new Employee();

        manager.fillCorrectEmployeeFullName(developer);
        manager.fillCorrectEmployeeCountry(developer);
        manager.fillCorrectEmployeeAge(developer);

        System.out.println(developer);
    }
}
