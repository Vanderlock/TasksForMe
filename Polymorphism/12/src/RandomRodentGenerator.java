import java.util.*;

class RandomRodentGenerator {
    Random rand = new Random();

    public Rodent next() {
        switch (rand.nextInt(3)) {

            case 0:
                return new Mouse();

            case 1:
                return new Rat();

            case 2:
                return new Squirrel();

            default:
                return null;

        }
    }
}