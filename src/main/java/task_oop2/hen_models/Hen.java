package task_oop2.hen_models;

import task_oop2.HenType;

public class Hen {

    private int countOfEggs;
    private HenType henType;

    public int getCountOfEggsPerMonth() {
        return  countOfEggs;
    }

    public Hen(HenType henType, int countOfEggs) {
        this.henType = henType;
        this.countOfEggs = countOfEggs;
    }

    public int getCountOfEggs() {
        return countOfEggs;
    }

    public HenType getHenType() {
        return henType;
    }

    public String getDescription() {
        return "Я курица.";
    }
}
