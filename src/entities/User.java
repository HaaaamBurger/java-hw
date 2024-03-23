package entities;

import enums.EGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
