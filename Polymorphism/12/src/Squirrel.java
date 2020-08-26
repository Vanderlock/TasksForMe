public class Squirrel extends  Rodent{
    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");
    Squirrel() {
        System.out.println("Squirrel()");
    }
    protected void eat() {
        System.out.println("Squirrel.eat()");
    }
    protected void run() {
        System.out.println("Squirrel.run()");
    }
    protected void sleep() {
        System.out.println("Squirrel.sleep()");
    }
    public String toString() {
        return name;
    }
}
