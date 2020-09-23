public class Rodent {


    Characteristic c = new Characteristic("has tail");
    Description d = new Description("small mammal");

    public Rodent() {
        System.out.println("Rodent  constructor" );
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

}
