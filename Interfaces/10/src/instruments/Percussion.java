package instruments;

import enums.Note;
import interfaces.Instrument;
import interfaces.Playable;

public class Percussion implements Instrument, Playable {

    public void play(Note n) {
        System.out.println(this + ".play:" + n);
    }

    public String toString() {
        return "instruments.Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
