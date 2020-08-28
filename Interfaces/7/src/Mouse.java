public class Mouse implements Rodent{
    private String name = "Mouse";


    public void eat() {
        System.out.println("Mouse eat");
    }


    public void run() {
        System.out.println("Mouse run");
    }


    public void sleep() {
        System.out.println("Mouse sleep");
    }
    public String toString(){
        return name;
    }
}
