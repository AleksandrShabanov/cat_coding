package task_reflection;

import task_reflection.models.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionUserTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        User user = null;
        User user2 = null;

        Class aClass = Class.forName(User.class.getName());
        user = (User) aClass.newInstance();
        Class c = user.getClass();

        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }

        Class[] params = {String.class, int.class};
        user2 = (User) aClass.getConstructor(params).newInstance("Max", 12);
        System.out.println("User 2 >>> " + user2 + "\n");

        System.out.println(user);

        Field fieldName = c.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(user, "Alex");
        System.out.println(user);

        Field fieldAge = c.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.set(user, 23);
        System.out.println(user);
    }
}
