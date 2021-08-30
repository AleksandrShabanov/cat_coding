package task_clone.models;

/**
 *  1) на свое усмотрение(прояви творчество) - напиши программу с демонстрацией поверхностного клонирования
 */

public class Terminator implements Cloneable {
    private String modelName;
    private int yearOfIssue;
    private SkyNet skyNet;

    public Terminator(String modelName, int yearOfIssue, SkyNet skyNet) {
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.skyNet = skyNet;
    }

    public Terminator(String modelName, int yearOfIssue) {
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public SkyNet getSkyNet() {
        return skyNet;
    }

    public void setSkyNet(SkyNet skyNet) {
        this.skyNet = skyNet;
    }

    @Override
    public Terminator clone() throws CloneNotSupportedException {
        Terminator clone = (Terminator) super.clone();
        SkyNet skyNet = this.skyNet.clone();
        clone.setSkyNet(skyNet);

        return clone;
    }

    @Override
    public String toString() {
        return "Terminator{" +
                "modelName='" + modelName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", skyNet=" + skyNet +
                '}';
    }
}
