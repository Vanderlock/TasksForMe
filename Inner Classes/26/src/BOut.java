public class BOut {
    public class BInn extends AOut.AInn {
        BInn (AOut a){
            a.super("Hello World");
            System.out.println("BOut.BInn");
        }
    }
}
