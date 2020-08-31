package instruments;

import enums.Note;

import interfaces.Playable;

public class Wind implements Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play:" + n);
    }
    @Override
    public String toString() {
        return "instruments.Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
