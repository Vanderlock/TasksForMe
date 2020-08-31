public class Rat extends Rodent{
    String name = "Rat";
    Characteristic c = new Characteristic("larger");
    Description d = new Description("black");
    Rat(Shared shared) {
        super(shared);
        System.out.println("Rat()");
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
    public String toString() {
        return name + " " + super.toString();
    }
}
