//Exercise 10:   (3) Modify Musics.java by adding a interfaces.Playable interface. Move the play( ) declaration from interfaces.Instrument to interfaces.Playable.
// Add interfaces.Playable to the derived classes by including it in the implement s list.
// Change tune( ) so that it takes a interfaces.Playable instead of an interfaces.Instrument.


import enums.Note;
import instruments.*;
import interfaces.Playable;

public class Runner {
    static void tune(Playable p){
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e){
        for (Playable p: e) {
            tune(p);
        }
    }

    public static void main(String[] args) {
        Playable [] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
