package task_clone.test.models;

public class User implements Cloneable {
    private Company company;
    private String name;
    private String surname;

    public User() {
    }

    public User(Company company, String name, String surname) {
        this.company = company;
        this.name = name;
        this.surname = surname;
    }

    public User(User original) {
        this.name = original.name;
        this.surname = original.surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        Company company = this.company.clone();
        clone.setCompany(company);
        return clone;
    }

    @Override
    public String toString() {
        return "User{" +
                "company=" + company +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
