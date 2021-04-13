package task5;

public class Test {
    public static void main(String[] args) {
        User worker = new User();
        worker.setName("Viktor");
        worker.setSurname("Ivanov");
        worker.setNickname("Troll killer");
        worker.setAge(28);
        worker.setCity("Moscow");

        worker.doWork();
        worker.eat();
        worker.sleep();
        System.out.println();

        Animal dog = new Animal();
        dog.setName("Sharik");
        dog.setColor("black");
        dog.setAge(5);

        dog.eat();
        dog.run();
        dog.sleep();
        System.out.println();

        Car camry = new Car();
        camry.setBrand("Toyota");
        camry.setModel("Camry");
        camry.setColor("red");
        camry.setGasolineTankVolume(50);
        camry.setGasolineInCar(30);

        camry.drive();
        System.out.println(camry.refuel(30));
    }
}
