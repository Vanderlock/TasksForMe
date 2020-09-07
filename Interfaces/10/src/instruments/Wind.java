package instruments;

import enums.Note;

import interfaces.Instrument;
import interfaces.Playable;

public class Wind implements Playable, Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play:" + n);
    }
    @Override
    public String toString() {
        return "instruments.Wind";
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
