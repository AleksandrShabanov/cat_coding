package task_oop2;

import task_oop2.hen_models.*;

public class HenFabric {

    public static Hen createHen(Hen hen) {

        switch (hen.getHenType()) {
            case RUSSIA:
                return new RussianHen(hen.getHenType(), hen.getCountOfEggs());
            case BELARUS:
                return new BelarusianHen(hen.getHenType(), hen.getCountOfEggs());
            case UKRAINE:
                return new UkrainianHen(hen.getHenType(), hen.getCountOfEggs());
            case MOLDAVIA:
                return new MoldovanHen(hen.getHenType(), hen.getCountOfEggs());
        }

        return null;
    }

    }
