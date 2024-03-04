package intsrument.classes;

import intsrument.interfaces.IInstrument;

public class Trumpet implements IInstrument {
    private short diameter;

    public Trumpet(short diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("The Trumpet sounds! Diameter is " + this.diameter);
    }

}
