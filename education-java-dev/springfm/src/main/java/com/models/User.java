// this class is model (bean); no logic inside

package com.models;

import com.annotation_test.NickNameAnnotation;

public class User {

    @NickNameAnnotation(value = "userName")
    private String name;
    private String surname;
    private int age;


    //constructor
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    public static void main(String[] args) {
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", age=" + age +
                '}';
    }
}
