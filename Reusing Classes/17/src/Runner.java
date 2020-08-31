//Exercise 16:   (2) Create a class called Amphibian.
// From this, inherit a class called Frog.
// Put appropriate methods in the base class.
// In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
//Exercise 17:   (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class
// (provides new definitions using the same method signatures).
// Note what happens in main( ).

//Q: What about Amphibian
//A: Added amphibian and called a static method through the class
//Q: What will be if you will work without static?
//A: if "grow" is made non-static then it will be called only through the created object

public class Runner {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        // call overridden base-class methods
        frog.swim();
        frog.croak();
        frog.eat();


        Amphibian.grow(frog);
        Frog.grow(frog);


    }
}
