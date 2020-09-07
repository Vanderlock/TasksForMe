package instruments;

import enums.Note;

import interfaces.Instrument;
import interfaces.Playable;

public class Percussion implements Playable, Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play:" + n);
    }
    @Override
    public String toString() {
        return "instruments.Percussion";
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
