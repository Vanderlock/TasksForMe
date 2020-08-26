//Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.


//Exercise 17:   (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method
// to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types
// and upcast them to an array of Cycle.
// Try to call balance( ) on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens.




public class Runner {

    public static void main(String[] args) {
        Cycle[] ride = {new Unicycle(),new Bicycle(),new Tricycle()};
//        for (Cycle c: ride) {
//            c.balance();
//        }
        ((Unicycle)ride[0]).balance();
        ((Bicycle)ride[1]).balance();
        // Compile time error: no balance() in Tricycle:
        // ((Tricycle)ride[2]).balance();
        // Exception in thread "main" java.lang.ClassCastException: Tricycle cannot be cast to Bicycle
        //	at Runner.main(Runner.java:27)
         ((Bicycle)ride[2]).balance();
    }
}
