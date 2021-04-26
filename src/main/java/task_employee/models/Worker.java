package task_employee.models;

public class Worker extends Employee{
    private double workingTime;
    public Worker(double workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    public void getSalary() {
        double resultSalary = 100 * workingTime;
        System.out.println("Зарплата рабочего: " + resultSalary);
    }
}
