//Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
//Exercise 5:   (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
// which returns the number of wheels. Modify ride( ) to call
// wheels( ) and verify that polymorphism works.


public class Runner {

    public static void main(String[] args) {
        Cycle u = new Unicycle();
        Cycle b = new Bicycle();
        Cycle t = new Tricycle();

        u.ride();
        b.ride();
        t.ride();


    }
}
