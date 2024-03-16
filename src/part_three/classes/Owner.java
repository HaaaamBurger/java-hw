package part_three.classes;

public class Owner {
    private String name;
    private short age;
    private short exp;
    private boolean isQualified;


    public Owner(String name, short age, short exp, boolean isQualified) {
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.isQualified = isQualified;
    }
    protected String getName() {
        return this.name;
    }
    protected short getAge() {
        return this.age;
    }
    protected short getExp() {
        return this.exp;
    }
    protected boolean getIsQualified() {
        return this.isQualified;
    }

}
