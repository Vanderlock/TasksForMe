//Exercise 1:   (1) Write a class named Outer that contains an inner class named Inner.
// Add a method to Outer that returns an object of type Inner. In main( ),
// create and initialize a reference to an Inner.



public class Runner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.makeInner();

    }
}
