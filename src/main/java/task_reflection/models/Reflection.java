package task_reflection.models;

public class Reflection {
    private String name = "My name is";

    private void printInfo() {
        System.out.println("PrintInfo method");
    }

    public void openPrintInfo() {
        System.out.println("Open printInfo method");
    }

    @Override
    public String toString() {
        return "Reflection{" +
                "name='" + name + '\'' +
                '}';
    }
}
