package intsrument.classes;

import intsrument.interfaces.IInstrument;

public class Guitar implements IInstrument {
    private short numberStrings;

    public Guitar(short numberStrings) {
        this.numberStrings = numberStrings;
    }

    @Override
    public void play() {
        System.out.println("The guitar sounds! Number of strings is " + this.numberStrings);
    }
}
