//Exercise 10:   (3) Modify Musics.java by adding a interfaces.Playable interface.
// Move the play( ) declaration from interfaces.Instrument to interfaces.Playable.
// Add interfaces.Playable to the derived classes by including it in the implement s list.
// Change tune( ) so that it takes a interfaces.Playable instead of an interfaces.Instrument.


//Q:Reason of using Note as parameter?
//A: It was in the book example
//Q: Check this part of task: Change tune( ) so that it takes a interfaces.Playable instead of an interfaces.Instrument. Your interfaces are different
//A: I deleted unused interface


import enums.Note;
import instruments.*;
import interfaces.Instrument;
import interfaces.Playable;

public class Runner {
    static void adj(Instrument i){
        i.adjust();
    }
    static void tune(Playable p){
        p.play(Note.B_FLAT);
    }
    static void tuneAll(Playable[] e){
        for (Playable p: e) {
            adj((Instrument) p);
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
