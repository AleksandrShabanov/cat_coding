package task_serializable.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadUser {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
