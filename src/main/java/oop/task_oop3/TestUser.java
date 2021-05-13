package oop.task_oop3;

import oop.task_oop3.models_users.Employee;
import oop.task_oop3.models_users.Student;
import oop.task_oop3.models_users.User;

/**
 * 2) Пусть у вас есть класс User, а от него наследуют классы Employee и Student.
 *
 * При этом предполагается, что вы будете создавать объекты классов Employee и Student,
 * но объекты класса User - не будете, так как сам класс User используется только для группировки общих свойств и
 * методов своих наследников.
 *
 * В этом случае можно принудительно запретить создавать объекты класса User,
 * чтобы вы или другой программист где-нибудь их случайно не создали.
 * Для этого существуют так называемые абстрактные классы. Продемонстрируйте иерархию для этой задачи в коде
 */

public class TestUser {
    public static void main(String[] args) {
        User employee = new Employee("Ivan", "Bondarev", 32);
        User student = new Student("Uliya", "Ivanova", 21);

        employee.printInfo();
        student.printInfo();
    }
}
