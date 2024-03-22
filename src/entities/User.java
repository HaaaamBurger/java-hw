package entities;

import enums.EGender;
import lombok.Data;

@Data
public class User {
    private String name;
    private int age;
    private EGender gender;

    public User(String name, int age, EGender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
