public class Rat extends Rodent{
    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");
    Rat() {
        System.out.println("Rat()");
    }
    protected void eat() {
        System.out.println("Rat.eat()");
    }
    protected void run() {
        System.out.println("Rat.run()");
    }
    protected void sleep() {
        System.out.println("Rat.sleep()");
    }
    public String toString() {
        return name;
    }
}
