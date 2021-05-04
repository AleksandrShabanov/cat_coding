package task_oop2.hen_models;

import task_oop2.HenType;

public class MoldovanHen extends Hen{
    private int countOfEggs;

    public MoldovanHen(int countOfEggs) {
        this.countOfEggs = countOfEggs;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + HenType.MOLDAVIA + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
