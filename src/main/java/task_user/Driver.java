package task_user;

/**
 * 2 задачка
 * ===========
 * 2) Сделайте класс Driver (Водитель), который будет наследоваться от класса Worker из предыдущей задачи.
 * Этот метод должен вносить следующие private поля: водительский стаж, категория вождения (A, B, C).
 */
public class Driver extends Worker{
    private int drivingExperience;
    private String drivingCategory;

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public String getDrivingCategory() {
        return drivingCategory;
    }

    public void setDrivingCategory(String drivingCategory) {
        this.drivingCategory = drivingCategory;
    }
}
