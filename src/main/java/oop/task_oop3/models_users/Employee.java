package oop.task_oop3.models_users;

public class Employee extends User{


    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Имя сотрудника: " + getName() + " Фамилия сотрудника: " + getSurname() + " Возраст сотрудника: "
                +  getAge());
    }
}
