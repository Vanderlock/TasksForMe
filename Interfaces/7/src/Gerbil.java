public class Gerbil implements Rodent {
    private String name = "Gerbil";


    public void eat() {
        System.out.println("Gerbil eat");
    }


    public void run() {
        System.out.println("Gerbil run");
    }


    public void sleep() {
        System.out.println("Gerbil sleep");
    }
    public String toString(){
        return name;
    }
}
