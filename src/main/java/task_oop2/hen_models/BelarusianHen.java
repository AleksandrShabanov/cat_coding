package task_oop2.hen_models;

import task_oop2.HenType;

import java.util.Scanner;

public class BelarusianHen extends Hen{
    private int countOfEggs;

    public BelarusianHen(int countOfEggs) {
        this.countOfEggs = countOfEggs;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + HenType.BELARUS + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }

    }
