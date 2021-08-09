package task_junit.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    Library library;

    @Before
    public void init() {
        this.library = new Library();
    }

    @Test
    public void testAddedUsersToLibraryDB_NOT_NULL() {
        //Given
        User user = new User("Ivan V", 21, 1);
//        User user  = null;
        List<User> actual = new ArrayList<>();
        actual.add(user);

        // When
        List<User> expected = new ArrayList<>();
        expected = library.addedUsersToLibraryDB(expected, user);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveUsersFromLibraryDB() {
        //Given
        User user = new User("Petr P", 21, 3);
        User user1 = new User("Anna A", 44, 1);
        List<User> actual = new ArrayList<>();
        actual.add(user1);

        //When
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected = library.removeUsersFromLibraryDB(expected, user);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllUsers() {
        //Given
        User user = new User("Ivan Petrov", 21, 1);
        List<User> actual = new ArrayList<>();
        actual.add(user);
        library.setUsers(actual);

        //When
        List<User> expected = library.getAllUsers();

        //Than
        Assert.assertEquals(expected, actual);
    }


}