package task_association.models_fish;

public class Fish {
    private String fishName;
    private Aquarium aquarium;

    public Fish(String fishName) {
        this.fishName = fishName;
        this.aquarium = new Aquarium();
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fishName='" + fishName + '\'' +
                ", aquarium=" + "рыба в аквариуме" +
                '}';
    }
}
