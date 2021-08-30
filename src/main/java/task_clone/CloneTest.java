package task_clone;

import task_clone.models.Terminator;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Terminator t1000 = new Terminator("T1000", 2029);
        System.out.println("Terminator t1000: " + t1000);

        Terminator t1000Clone = t1000.clone();
        System.out.println("Terminator t1000 clone: " + t1000Clone);

        System.out.println("Clone was done");

        t1000.setModelName("T1001");
        System.out.println("Terminator t1000: " + t1000);
        System.out.println("Terminator t1000 clone: " + t1000Clone);

    }
}
