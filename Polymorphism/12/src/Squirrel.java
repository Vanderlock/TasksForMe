public class Squirrel extends  Rodent{

    Characteristic c = new Characteristic("climbs trees");
    Description d = new Description("likes nuts");
    Squirrel() {
        System.out.println("Squirrel "+ c.s + " and " +d.s);
    }
    void eat() {
        System.out.println("Squirrel.eat()");
    }
    void run() {
        System.out.println("Squirrel.run()");
    }
    void sleep() {
        System.out.println("Squirrel.sleep()");
    }

}
