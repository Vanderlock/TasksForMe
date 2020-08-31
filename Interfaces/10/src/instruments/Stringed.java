package instruments;

import enums.Note;

import interfaces.Playable;

public class Stringed implements  Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play:" + n);
    }
    @Override
    public String toString() {
        return "instruments.Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
