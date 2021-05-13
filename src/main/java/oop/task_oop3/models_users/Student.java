package oop.task_oop3.models_users;

public class Student extends User{
    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Имя студента: " + getName() + " Фамилия студента: " + getSurname() + " Возраст студента: "
                + getAge());
    }
}
