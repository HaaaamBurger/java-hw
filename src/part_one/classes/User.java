package part_one.classes;

public class User {
    private String name;
    private short age;

    public User(String name, short age) {
        this.name = name;
        this.age = age;
    }
    public short getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
}
