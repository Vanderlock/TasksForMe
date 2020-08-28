//Exercise 13:   (2) Create an interface, and inherit two new interfaces from that interface.
// Multiply inherit a third interface from the second two


import interfaces.CanFight;
import interfaces.FightJudo;
import interfaces.FightKarate;

public class Runner {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        ((FightKarate)fighter).karate();
        ((FightJudo)fighter).judo();
        ((CanFight)fighter).fight();

    }
}
