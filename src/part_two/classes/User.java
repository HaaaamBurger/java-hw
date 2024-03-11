package part_two.classes;

import part_two.enums.EGender;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;
    private String email;
    private short age;
    private EGender gender;
    private List<Skill> skills;
    private Car car;

    public User(){
        this.id = ++idCounter;
    };

    public User name(String name) {
        this.name = name;
        return this;
    }
    public User surname(String surname){
        this.surname = surname;
        return this;
    }
    public User email(String email) {
        this.email = email;
        return this;
    }
    public User age(short age) {
        this.age = age;
        return this;
    }
    public User gender(EGender gender) {
        this.gender = gender;
        return this;
    }
    public User skills(Skill skill) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.add(skill);

        return this;
    }
    public User car(Car car) {
        this.car = car;
        return this;
    }
}
