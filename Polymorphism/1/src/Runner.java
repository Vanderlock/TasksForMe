//Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.




public class Runner {
    public static void ride(Cycle c) {
        c.travel(c);
    }
    public static void main(String[] args) {
//        Unicycle u = new Unicycle();
//        Bicycle b = new Bicycle();
//        Tricycle t = new Tricycle();

        Cycle u = new Unicycle();
        Cycle b = new Bicycle();
        Cycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);

    }
}
