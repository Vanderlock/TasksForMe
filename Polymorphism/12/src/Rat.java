public class Rat extends Rodent{

    Characteristic c = new Characteristic("larger");
    Description d = new Description("black");
    Rat() {
        System.out.println("Rat "+ c.s + " and " +d.s);
    }
    void eat() {
        System.out.println("Rat.eat()");
    }
    void run() {
        System.out.println("Rat.run()");
    }
    void sleep() {
        System.out.println("Rat.sleep()");
    }

}
