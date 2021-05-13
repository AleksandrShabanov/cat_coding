package oop.task_oop2.hen_models;

import oop.task_oop2.HenType;

public class MoldovanHen extends Hen{

    public MoldovanHen(HenType henType, int countOfEggs) {
        super(henType, countOfEggs);
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
