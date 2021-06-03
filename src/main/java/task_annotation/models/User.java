package task_annotation.models;

import task_annotation.annotations.Number;

public class User {

    @Number(value = 20)
    private int age;

    @Number(value = 1500)
    private int salary;

    @Override
    @Number(value = 1)
    public String toString() {
        return "User{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}
