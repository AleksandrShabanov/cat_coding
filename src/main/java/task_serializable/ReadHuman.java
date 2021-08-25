package task_serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadHuman {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("human_data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
