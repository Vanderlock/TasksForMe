public class Gerbil implements IRodent {

    Gerbil(){
        System.out.println("Gerbil created; ");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void run() {
        System.out.println("Gerbil run");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil sleep");
    }


}
