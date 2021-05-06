package task_oop2.hen_models;

import task_oop2.HenType;

public class RussianHen extends Hen {

    public RussianHen(HenType henType, int countOfEggs) {
        super(HenType.RUSSIA, countOfEggs);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return super.getCountOfEggs();
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + super.getHenType() + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
