public class Rodent {
    String name = "Rodent";
    Shared shared;
    static int counter = 1;
    int id = counter++;
    Characteristic c = new Characteristic("has tail");
    Description d = new Description("small mammal");

    public Rodent(Shared shared) {
        this.shared = shared;
        this.shared.addRef();
    }
    void eat(){
        System.out.println("Rodent eat");
    }
    void run(){
        System.out.println("Rodent run");
    }
    void sleep(){
        System.out.println("Rodent sleep");
    }
    public String toString(){
        return name + " = " + id;
    }
}
