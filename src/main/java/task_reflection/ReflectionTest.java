package src.main.java.task_reflection;

import task_reflection.models.Reflection;

import java.lang.reflect.Field;

/**
 * 1) напиши программу, в которой попробуй сделать так чтобы ты смогу
 * к строке добавить символы(модифицировать строку) и при этом чтобы hashcode данной строки не изменился,
 * и изменения остались (адрес памяти не поменялся) - используй для этого рефлексию
 * <p>
 * String str = "test";
 * int hashBeforeChanges = str.hash();
 * ...//модификация строки
 * int hashAfterChanges = str.hash();
 * sout(hashBeforeChanges == hashAfterChanges);//должно вернуть true
 */

public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Object obj = new Reflection();
        Class aClass = obj.getClass();

        Field nameField = aClass.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(obj);
        int hashBefore = nameValue.hashCode();
        System.out.println("Before >>>> " + nameField.get(obj));

        nameField.set(obj, ((String) nameField.get(obj)).concat(" Max"));
        int hashAfter = nameValue.hashCode();
        System.out.println("After >>>> " + nameField.get(obj));
        System.out.println(hashBefore == hashAfter);

    }
}
