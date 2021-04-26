package task_employee.models;

public class Agent extends Employee{
    private double salary = 5000;
    private double volumeOfSales;
    public Agent(double volumeOfSales) {
        this.volumeOfSales = volumeOfSales;
    }

    @Override
    public void getSalary() {
        double resultSalary = salary + (0.05 * volumeOfSales);
        System.out.println("Зарплата агента: " + resultSalary);
    }
}
