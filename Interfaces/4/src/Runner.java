//Exercise 4:   (3) Create an abstract class with no methods.
// Derive a class and add a method. Create a static method that takes a reference to the base class,
// downcasts it to the derived class, and calls the method.
// In main( ), demonstrate that it works. Now put the abstract declaration for the method in the base class,
// thus eliminating the need for the downcast.



public class Runner {
    public static void downcast(Basement b){
        ((Skyscraper)b).print();
    }
    public static void useAbstract(Roof r){
        r.print();
    }
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Runner.downcast(skyscraper);
        Cottage cottage = new Cottage();
        Runner.useAbstract(cottage);

    }
}
