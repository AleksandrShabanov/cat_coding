package task_phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone apple = new Phone(89001230009L, "Iphone 12", 120);
        Phone samsung = new Phone(89205626226L, "A10", 132);
        Phone xiaomi = new Phone(89030099080L, "Redmi 9", 143);

        System.out.println("Model: " + apple.getModel() + "; Phone number: " + apple.getNumber() + "; Weight: " + apple.getWeight());
        System.out.println("Model: " + samsung.getModel() + "; Phone number: " + samsung.getNumber() + "; Weight: " + samsung.getWeight());
        System.out.println("Model: " + xiaomi.getModel() + "; Phone number: " + xiaomi.getNumber() + "; Weight: " + xiaomi.getWeight() + "\n");

        apple.receiveCall("Alex");
        samsung.receiveCall("David");
        xiaomi.receiveCall("Mariya");
        System.out.println();

        apple.receiveCall("Alex", apple.getNumber());
        samsung.receiveCall("David", samsung.getNumber());
        xiaomi.receiveCall("Mariya", xiaomi.getNumber());
        System.out.println();

        apple.sendMessage(89001230009L, 89205626226L, 89030099080L);
    }
}
