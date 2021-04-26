package task_employee.models;

public class Manager extends Employee{
    private final double MANAGER_SALARY = 13000;

    @Override
    public void getSalary() {
        System.out.println("Зарплата менедежера: " + MANAGER_SALARY);
    }
}
