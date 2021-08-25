package task_serializable.test;

import java.io.*;

public class User extends ParentUser implements Serializable{
    private String name2;
    private String securityField;
    private static final long serialVersionUID = 5343142677829708586L;

    public User(String name) {
        super("Dou", 23);
        this.securityField = "secure";
        this.name2 = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name2 + '\'' +
                securityField +
                super.toString() +
                '}';
    }

}
