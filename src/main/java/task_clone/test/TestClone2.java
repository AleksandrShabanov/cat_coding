package task_clone.test;

import task_clone.test.models.User;

public class TestClone2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("n1", "s2");
        User clone = user.clone();

        user.setName("n1 - new");
        System.out.println(user);
        System.out.println(clone);
    }
}
