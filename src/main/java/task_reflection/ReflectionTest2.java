package task_reflection;

import java.lang.reflect.Field;

public class ReflectionTest2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "test";
        int hashBeforeChanges = str.hashCode();
        System.out.println("Before " + str);

        Class<? extends String> aClass = str.getClass();
        Field field = aClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str, "test123".toCharArray());


        int hashAfterChanges = str.hashCode();
        System.out.println(hashBeforeChanges == hashAfterChanges);//должно вернуть true
        System.out.println("After " + str);
    }
}
