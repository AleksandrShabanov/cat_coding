package task_annotation;

import task_annotation.annotations.Number;
import task_annotation.models.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) {
        Object o = new User();
        Class aClass = o.getClass();
        int sumOfAnnotations = 0;

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Number.class)) {
                Number number = field.getAnnotation(Number.class);
                sumOfAnnotations += number.value();
            }
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Number.class)) {
                Number number = method.getAnnotation(Number.class);
                sumOfAnnotations += number.value();
            }
        }

        System.out.println(sumOfAnnotations);
    }
}
