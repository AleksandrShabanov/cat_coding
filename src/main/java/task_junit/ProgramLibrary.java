package task_junit;

import task_junit.models.Library;
import task_junit.models.User;

import java.util.ArrayList;
import java.util.List;

public class ProgramLibrary {
    public static void main(String[] args) {
        User user = new User("Ivan Petrov", 21, 1);
        User user1 = new User("Anna Petrova", 13, 2);
        User user2 = new User("Fedor Ivanov", 45, 3);
        Library library = new Library();
        List<User> libraryDB = new ArrayList<>();

        Library.addedUsersToLibraryDB(libraryDB, user);
        Library.addedUsersToLibraryDB(libraryDB, user1);
        Library.addedUsersToLibraryDB(libraryDB, user2);

        library.setUsers(libraryDB);
        System.out.println(library.getAllUsers());
    }
}
