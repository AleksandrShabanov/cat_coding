package task_exceptions.models;

import task_exceptions.exceptions.IncorrectAge;
import task_exceptions.exceptions.IncorrectCountry;
import task_exceptions.exceptions.IncorrectFullName;

import java.util.Scanner;

/**
 * 1) разработай приложение которое принимает от менеджера данные
 * по юзеру/сотруднику: имя, фамилию, возраст, страну проживания
 * <p>
 * 2) предусмотри валидацию введённых данных
 * - если возраст отрицательный или больше 150 лет то выбрасывай кастомную ошибку
 * - если имя или фамилия и тд меньше 2 букв - аналогично выбрасывай ошибку соответствующего типа
 * - если страна не входит в список стран xxx, yyyy, zzzz (можешь сделать enum),-
 * тоже выбрасывать ошибку, тк менеджер например может работать/регистрировать сотрудника только из
 * определенной локации
 */

public class Manager {

    Employee newEmployee = new Employee();
    Scanner scanner = new Scanner(System.in);

    public int correctEmployeeAge() {
        newEmployee.setAge(scanner.nextInt());

        if (newEmployee.getAge() < 0 || newEmployee.getAge() > 150) {
            throw new IncorrectAge("Incorrect age: " + newEmployee.getAge());
        }

        System.out.print("Employee age: ");
        return newEmployee.getAge();
    }

    public String correctEmployeeFullName() {
        newEmployee.setName(scanner.nextLine());
        newEmployee.setSurname(scanner.nextLine());

        if (newEmployee.getName().length() < 2 || newEmployee.getSurname().length() < 2) {
            throw new IncorrectFullName("Incorrect FullName: " + newEmployee.getName() + " " + newEmployee.getSurname());
        }

        return "Employee FullName: " + newEmployee.getName() + " " + newEmployee.getSurname();
    }

    public String correctEmployeeCountry() {
        newEmployee.setCountryOfResidence(scanner.nextLine());

        if (newEmployee.getCountryOfResidence().equals(Country.RUSSIA.toString()) ||
                newEmployee.getCountryOfResidence().equals(Country.FRANCE.toString()) ||
                newEmployee.getCountryOfResidence().equals(Country.ITALY.toString()) ||
                newEmployee.getCountryOfResidence().equals(Country.SPAIN.toString())) {
            return "Employee country: " + newEmployee.getCountryOfResidence();
        } else {
            throw new IncorrectCountry("Incorrect country: " + newEmployee.getCountryOfResidence());
        }
    }

}
