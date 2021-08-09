package task_junit.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<User> users = new ArrayList<>();

    public Library() {
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> addedUsersToLibraryDB(List<User> users, User user) {

        if (user != null) {
            users.add(user);
        }

        setUsers(users);
        return getAllUsers();
    }

    public List<User> removeUsersFromLibraryDB(List<User> users, User user) {

        for (User userWeNeed : users) {
            if (userWeNeed.equals(user)) {
                users.remove(userWeNeed);
            }
        }

        return users;
    }


}
