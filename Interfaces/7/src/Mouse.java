public class Mouse implements IRodent {
    public Mouse() {
        System.out.println("Mouse created; ");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void run() {
        System.out.println("Mouse run");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleep");
    }

}
