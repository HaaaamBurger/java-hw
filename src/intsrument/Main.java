package intsrument;

import intsrument.classes.Drum;
import intsrument.classes.Guitar;
import intsrument.classes.Trumpet;
import intsrument.interfaces.IInstrument;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IInstrument guitar = new Guitar((short) 7);
        IInstrument drum = new Drum((short) 28);
        IInstrument trumpet = new Trumpet((short) 124);

        ArrayList<IInstrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        for(IInstrument instrument : instruments) {
            instrument.play();
        }

    }
}
