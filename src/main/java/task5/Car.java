package task5;

/**
 * Машина
 *
 * характеристики/атрибуты
 * - марка
 * - модель
 * - цвет
 * - объем бака
 * - бензин в баке
 *
 *
 * функциональность
 * - ехать
 * - заправляться
 */
public class Car {

    private String brand;
    private String model;
    private String color;
    private int gasolineTankVolume;
    private int gasolineInCar;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGasolineTankVolume() {
        return gasolineTankVolume;
    }

    public void setGasolineTankVolume(int gasolineTankVolume) {
        this.gasolineTankVolume = gasolineTankVolume;
    }

    public int getGasolineInCar() {
        return gasolineInCar;
    }

    public void setGasolineInCar(int gasolineInCar) {
        this.gasolineInCar = gasolineInCar;
    }

    public void drive(){
        System.out.println(brand + " " + model + " " + " drives");
    }

    public int refuel(int gasoline){
        if (gasolineInCar < gasolineTankVolume){
            if ((gasolineInCar += gasoline) > gasolineTankVolume){
                return gasolineTankVolume;
            }
            gasolineInCar += gasoline;
        }
        return gasolineInCar;
    }
}
