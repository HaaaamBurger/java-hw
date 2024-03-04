package intsrument.classes;

import intsrument.interfaces.IInstrument;

public class Drum implements IInstrument {
    private short size;

    public Drum(short size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("The drum sounds! Size is " + this.size);
    }
}
