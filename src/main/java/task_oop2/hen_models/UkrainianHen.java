package task_oop2.hen_models;

import task_oop2.HenType;

public class UkrainianHen extends Hen {
    private int countOfEggs;

    public UkrainianHen(int countOfEggs) {
        this.countOfEggs = countOfEggs;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + HenType.UKRAINE + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
