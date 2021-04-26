package task_phone;

/**
 * 3 задачка
 * ===========
 * Класс Phone.
 * 1) Создайте класс Phone, который содержит переменные number, model и weight.
 * 2) Создайте три экземпляра этого класса.
 * 3) Выведите на консоль значения их переменных.
 * <p>
 * 4) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * 5) Добавить конструктор в класс Phone, который принимает на вход три параметра для
 * инициализации переменных класса - number, model и weight.
 * 6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * <p>
 * 7) Добавить конструктор без параметров.
 * 8) Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * 9) Добавьте перегруженный метод receiveCall, который принимает два параметра -
 * имя звонящего и номер телефона звонящего. Вызвать этот метод.
 * <p>
 * 10) Создать метод sendMessage с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов.
 */
public class Phone {
    private long number;
    private String model;
    private double weight;

    Phone() {
    }

    Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println(name + " calls");
    }

    public void receiveCall(String name, long number) {
        System.out.println(name + " calls" + "; Number phone: " + number);
    }

    public void sendMessage(long number, long ... recipientNumbers) {
        System.out.println(number);
        for (long phoneNumbers : recipientNumbers) {
            System.out.println(phoneNumbers);
        }
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

}
