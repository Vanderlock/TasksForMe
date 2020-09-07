public class Hamster implements IRodent {

    public Hamster() {
        System.out.println("Hamster created; ");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void run() {
        System.out.println("Hamster run");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster sleep");
    }

}
