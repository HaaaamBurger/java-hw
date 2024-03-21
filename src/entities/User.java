package entities;

import enums.EGender;


public class User {
    private static int id;
    private String name;
    private int age;
    private EGender gender;

    public User(String name, int age, EGender gender) {
        id = id++;

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
