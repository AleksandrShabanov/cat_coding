package task_exceptions.models;

import task_exceptions.enums.CountryName;
import task_exceptions.exceptions.IncorrectAgeException;
import task_exceptions.exceptions.IncorrectCountryException;
import task_exceptions.exceptions.IncorrectFullNameException;

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
    Scanner scanner = new Scanner(System.in);

    public void fillCorrectEmployeeAge(Employee employee) {
        System.out.println("enter employee age: ");
        int age = scanner.nextInt();

        if (age < 0 || age > 150) {
            throw new IncorrectAgeException("Incorrect age: " + age);
        }

        employee.setAge(age);
    }

    public void fillCorrectEmployeeFullName(Employee employee) {
        System.out.println("enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("enter employee surname: ");
        String surname = scanner.nextLine();

        if (name.length() < 2 || surname.length() < 2) {
            throw new IncorrectFullNameException("Incorrect FullName: " + name + " " + surname);
        }

        employee.setName(name);
        employee.setSurname(surname);
    }

    public void fillCorrectEmployeeCountry(Employee employee) {
        System.out.println("enter country name: ");
        String countryName = scanner.nextLine();

        if (countryName.equals(CountryName.RUSSIA.toString()) ||
                countryName.equals(CountryName.FRANCE.toString()) ||
                countryName.equals(CountryName.ITALY.toString()) ||
                countryName.equals(CountryName.SPAIN.toString())) {
            employee.setCountryOfResidence(countryName);
        } else {
            throw new IncorrectCountryException("Incorrect country: " + countryName);
        }
    }

}
