package com.annotation_test;

import com.models.User;

import java.lang.reflect.Field;

public class UserAnnotationTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Object user = new User("naem", "surnaem", 20);
        Class metaData = user.getClass();
        Field name = metaData.getDeclaredField("name");

        NickNameAnnotation annotation = name.getAnnotation(NickNameAnnotation.class);

        if(annotation != null){
            System.out.println("annotation is available");
            System.out.println(annotation.value());

        }
    }
}
