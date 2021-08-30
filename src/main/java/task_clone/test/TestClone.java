package task_clone.test;

import task_clone.test.models.User;

public class TestClone {
    public static void main(String[] args) {
        User user = new User("n1", "s1");
        System.out.println(user);

        User clone = new User(user);
        System.out.println(clone);

        user.setName("nnn1");
        System.out.println(user);
        System.out.println(clone);

        User clone2 = new User();
        clone2.setName(user.getName());
        clone2.setSurname(user.getSurname());
        System.out.println(clone2);
    }
}
