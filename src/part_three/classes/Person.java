package part_three.classes;

public class Person {
    private static int idCounter;
    protected int personId;
    protected String name;

    public Person(String name) {
       this.personId = ++idCounter;

       this.name = name;
    }

}
