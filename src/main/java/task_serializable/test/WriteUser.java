package task_serializable.test;

import task_serializable.test.User;

import java.io.*;

public class WriteUser {
    public static void main(String[] args) {
        User john = new User("John");

        try {
            FileOutputStream data = new FileOutputStream("data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(data);
            objectOutputStream.writeObject(john);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
