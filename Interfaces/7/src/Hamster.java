public class Hamster implements Rodent{
    private String name = "Hamster";


    public void eat() {
        System.out.println("Hamster eat");
    }


    public void run() {
        System.out.println("Hamster run");
    }


    public void sleep() {
        System.out.println("Hamster sleep");
    }
    public String toString(){
        return name;
    }
}
