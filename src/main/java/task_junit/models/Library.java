package task_junit.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static List<User> addedUsersToLibraryDB(List<User> users, User user) {

        if (user != null) {
            users.add(user);
        }

        return users;
    }

}
