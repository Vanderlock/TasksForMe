//Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.




public class Runner {

    public static void main(String[] args) {

        new Unicycle().ride();
        new Bicycle().ride();
        new Tricycle().ride();

    }
}
