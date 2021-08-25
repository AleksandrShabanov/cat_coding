package task_exceptions;

import task_exceptions.models.Employee;
import task_exceptions.models.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee developer = new Employee();

        manager.fillCorrectEmployeeAge(developer);
        manager.fillCorrectEmployeeFullName(developer);
        manager.fillCorrectEmployeeCountry(developer);

        manager.fillCorrectEmployeeCountry(developer);
        manager.fillCorrectEmployeeCountry(developer);


        System.out.println(developer);
    }
}
