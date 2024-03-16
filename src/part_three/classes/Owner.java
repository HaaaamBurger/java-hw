package part_three.classes;

public class Owner {
    private String name;
    private short age;
    private short exp;


    public Owner(String name, short age, short exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public void changeExp(short exp) {
        this.exp = exp;
    }
    public String getName() {
        return this.name;
    }
    public short getAge() {
        return this.age;
    }
    public short getExp() {
        return this.exp;
    }

}
