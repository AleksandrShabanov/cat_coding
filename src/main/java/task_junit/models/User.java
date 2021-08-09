package task_junit.models;

import java.util.Objects;

public class User {

    private String fullName;
    private int age;
    private int libraryId;

    public User(String fullName, int age, int libraryId) {
        this.fullName = fullName;
        this.age = age;
        this.libraryId = libraryId;
    }

    public User() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && libraryId == user.libraryId && Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, libraryId);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", libraryId=" + libraryId +
                '}';
    }
}
