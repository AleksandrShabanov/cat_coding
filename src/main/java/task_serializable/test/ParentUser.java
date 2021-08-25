package task_serializable.test;

import java.io.Serializable;

public class ParentUser implements Serializable {

    private String surname;
    private transient int age;

    public ParentUser() {
    }

    public ParentUser(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ParentUser{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
