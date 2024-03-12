package part_three.classes;

import part_three.enums.EPetType;

public class Pet {
    private static int idCounter;
    protected int petId;
    protected String name;
    protected EPetType type;

    public Pet(String name, EPetType type) {
        this.petId = ++idCounter;

        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

}
