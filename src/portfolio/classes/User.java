package portfolio.classes;

import portfolio.enums.EGender;

import java.util.ArrayList;

public class User {
    private static int id;
    private String name;
    private String surname;
    private String email;
    private short age;
    private EGender gender;
    private ArrayList<Skill> skills;
    private Car car;

    public User() {
        id++;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User surname(String surname) {
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
    public User skills(ArrayList<Skill> skills) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }

        for(Skill item : skills) {
            Skill skill = new Skill(item.title, item.exp);
            this.skills.add(skill);
        }

        return this;
    }

    public User car(Car car) {
        this.car = car;
        return this;
    }

    public String toString() {
        return "id: " + id +
                "\nname: " + this.name +
                "\nsurname: " + this.surname +
                "\nemail: " + this.email +
                "\nage: " + this.age +
                "\ngender: " + this.gender +
                "\nskills: " + this.skills +
                "\ncar: " + this.car;
    }

}
