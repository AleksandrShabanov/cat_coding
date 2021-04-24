package task_user;

/**
 * 1 задачка
 * ===========
 * 1) Сделайте класс User, в котором будут следующие protected поля - name (имя), age (возраст),
 * public методы setName, getName, setAge, getAge.
 *
 * Сделайте класс Worker, который наследует от класса User и вносит дополнительное private поле salary (зарплата),
 * а также методы public getSalary и setSalary.
 *
 * Создайте объект этого класса 'Иван', возраст 25, зарплата 1000. Создайте второй объект этого класса 'Вася',
 * возраст 26, зарплата 2000. Найдите сумму зарплата Ивана и Васи.
 *
 * Сделайте класс Student, который наследует от класса User и вносит дополнительные private поля стипендия, курс,
 * а также геттеры и сеттеры для них.
 */

public class TestUser {
    public static void main(String[] args) {
        Worker ivan = new Worker();
        ivan.setName("Ivan");
        ivan.setAge(25);
        ivan.setSalary(1000);
        Worker vasya = new Worker();
        vasya.setName("Vasya");
        vasya.setAge(26);
        vasya.setSalary(2000);

        System.out.println("Worker's name: " + ivan.getName() + "; age: " + ivan.getAge() + "; salary: " + ivan.getSalary());
        System.out.println("Worker's name: " + vasya.getName() + "; age: " + vasya.getAge() + "; salary: " + vasya.getSalary());

        Student stan = new Student();
        stan.setName("Stan");
        stan.setAge(19);
        stan.setCourse("IT");
        stan.setScholarship(200);

        System.out.println("Student's name: " + stan.getName() + "; age: " + stan.getAge() + "; course: " + stan.getCourse() +
                "; Scholarship: " + stan.getScholarship());

        Driver driver = new Driver();
        driver.setName("Bob");
        driver.setAge(54);
        driver.setSalary(3000);
        driver.setDrivingExperience(30);


        System.out.println("Driver's name: " + driver.getName() + "; age: " + driver.getAge() + "; salary: " + driver.getSalary() +
                "; driving experience: " + driver. getDrivingExperience() + "; category: " + DrivingCategory.C);
    }
}
