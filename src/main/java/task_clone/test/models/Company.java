package task_clone.test.models;

public class Company implements Cloneable {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Company clone() throws CloneNotSupportedException {
        return (Company) super.clone();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
