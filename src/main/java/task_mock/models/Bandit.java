package task_mock.models;

public class Bandit extends Character{

    public Bandit(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void gotCaught() {
        System.out.println("Бандит отправлен в тюрьму");
    }


}
