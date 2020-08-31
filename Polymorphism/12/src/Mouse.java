public class Mouse extends Rodent {
    String name = "Mouse";
    Characteristic c = new Characteristic("likes cheese");
    Description d = new Description("nocturnal");
    Mouse() {
        System.out.println("Mouse()");
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
    public String toString() {
        return name;
    }
}
