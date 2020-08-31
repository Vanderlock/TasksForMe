public class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");
    Mouse() {
        System.out.println("Mouse()");
    }
    protected void eat() {
        System.out.println("Mouse.eat()");
    }
    protected void run() {
        System.out.println("Mouse.run()");
    }
    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }
    public String toString() {
        return name;
    }
}