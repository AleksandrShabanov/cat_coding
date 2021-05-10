package task_association.models_house;

public class House {
    private int countOfRooms;
    private Furniture furniture;

    public House(int countOfRooms, Furniture furniture) {
        this.countOfRooms = countOfRooms;
        this.furniture = furniture;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "countOfRooms=" + countOfRooms +
                ", furniture=" + "дом с мебелью" +
                '}';
    }
}
