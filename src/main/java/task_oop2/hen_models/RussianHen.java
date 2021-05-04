package task_oop2.hen_models;

import task_oop2.HenType;

public class RussianHen extends Hen {
    private int countOfEggs;

    public RussianHen(int countOfEggs) {
        this.countOfEggs = countOfEggs;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + HenType.RUSSIA + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
