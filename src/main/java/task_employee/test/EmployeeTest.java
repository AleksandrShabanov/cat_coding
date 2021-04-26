package task_employee.test;

import task_employee.models.Agent;
import task_employee.models.Employee;
import task_employee.models.Manager;
import task_employee.models.Worker;

/**
 * 5 задачка
 * Необходимо
 * Написать иерархию классов, описывающих служащих в компании. Она должна состоять из  базового класса Employee и
 * производных от него классов Manager, Agent и Worker. Базовый класс должен иметь чисто
 * метод рассчета заработной платы, переопределенный в каждом из производных классов. Заработная
 * плата Manager постоянна и равна 13000, заработная плата Agent определяется как оклад 5000 + 5% объема продаж,
 * который хранится в специальном поле класса Agent, и заработная плата Worker определяется как 100×число отработанных часов,
 * которое также хранится в отдельном поле (классы Agent и Worker должны иметь конструкторы повещественному числу,
 * устанавливающие значение своего поля).
 * <p>
 * В основной программе завести массив из 9 ячеек на Employee и заполнить его
 * указателями на объекты производных классов (первые 3 — Manager, следующие 3 —
 * Agent и последние 3 — Worker). Вывести на экран величину заработной платы всех 9 служащих.
 */

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employees[] = new Employee[9];

        for (int i = 0; i < employees.length; i++) {
            
            if (i <= 2) {
                employees[i] = new Manager();
            }
            if (i > 2 && i <= 5) {
                employees[i] = new Agent(300_000);
            }
            if (i > 5) {
                employees[i] = new Worker(50);
            }

            employees[i].getSalary();
        }

    }
}
