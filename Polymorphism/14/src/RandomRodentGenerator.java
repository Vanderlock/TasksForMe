import java.util.*;
class RandomRodentGenerator {
    Shared shared = new Shared();
    Random rand = new Random();
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Mouse(shared);
            case 1: return new Rat(shared);
            case 2: return new Squirrel(shared);
        }
    }
}