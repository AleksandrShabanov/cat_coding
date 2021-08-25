package task_serializable;

import task_serializable.models.Human;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteHuman {
    public static void main(String[] args) {
        Human human = new Human("John", 23, "Java Developer");

        try {
            FileOutputStream human_data = new FileOutputStream("human_data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(human_data);
            objectOutputStream.writeObject(human);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
