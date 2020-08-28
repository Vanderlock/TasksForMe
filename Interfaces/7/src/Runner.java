//Exercise 9:   (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
// In the base class, provide methods that are common to all Rodents, and override these in the derived classes
// to perform different behaviors depending on the specific type of Rodent.
// Create an array of Rodent, fill it with different specific types of Rodents,
// and call your base-class methods to see what happens.



//Exercise 7:   (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.




public class Runner {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        RandomRodentGenerator rand = new RandomRodentGenerator();
        for (Rodent r: rodents) {
            r = rand.next();
            System.out.println(r + ";");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
