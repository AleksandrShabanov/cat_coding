package task_junit.models;

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

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getLibraryId() {
        return libraryId;
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
