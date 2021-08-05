package task_junit.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library = new Library();
    @Test
    public void getAllUsers() {
        // тестовые данные
        User user = new User("Ivan Petrov", 21, 1);
        User user1 = new User("Anna Petrova", 13, 2);
        User user2 = new User("Fedor Ivanov", 45, 3);

        // заполняем список данными из нашаго метода
        List<User> expected = library.getAllUsers();

        // заполняем список actual данными для сравнения
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        // Запуск теста. В случае, если expected и actual не будут равны, тест будет провален
        Assert.assertEquals(expected, actual);
    }
}