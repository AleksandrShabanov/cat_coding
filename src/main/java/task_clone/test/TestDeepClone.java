package task_clone.test;

import task_clone.test.models.Company;
import task_clone.test.models.User;

public class TestDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Company company = new Company("NC");
        User user = new User(company, "n1", "s1");
        User clone = user.clone();

        System.out.println("user: " + user);
        System.out.println("clone: " + clone);
        System.out.println("clone was done");

        company.setName("NCNC-new");
        System.out.println("user: " + user);
        System.out.println("clone: " + clone);
    }
}
