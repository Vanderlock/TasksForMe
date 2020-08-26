public class Rodent {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    public Rodent() {
        System.out.println("Rodent()");
    }
    protected void eat(){
        System.out.println("Rodent eat");
    }
    protected void run(){
        System.out.println("Rodent run");
    }
    protected void sleep(){
        System.out.println("Rodent sleep");
    }
    public String toString(){
        return name;
    }
}
