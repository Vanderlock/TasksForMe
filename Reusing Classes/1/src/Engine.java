public class Engine {
    private String s;
    Engine() {
        System.out.println("Engine()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}
