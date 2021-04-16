package task5;

public class PersonTest {
    public static void main(String[] args) {
        Person petr = new Person("Петр Алексеев", 30);
        Person alex = new Person("Алексей Петров", 45);

        petr.move();
        petr.talk();
        alex.move();
        alex.talk();



    }
}
