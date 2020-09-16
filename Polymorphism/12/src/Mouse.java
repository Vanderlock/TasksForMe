public class Mouse extends Rodent {

    Characteristic c = new Characteristic("likes cheese");
    Description d = new Description("nocturnal");
    Mouse() {
        System.out.println("Mouse "+ c.s + " and " +d.s);
    }
    void eat() {
        System.out.println("Mouse.eat()");
    }
    void run() {
        System.out.println("Mouse.run()");
    }
    void sleep() {
        System.out.println("Mouse.sleep()");
    }

}
