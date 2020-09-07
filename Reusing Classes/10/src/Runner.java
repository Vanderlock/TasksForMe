//Exercise 9:   (2) Create a class called Root that contains an instance of each of the classes
// (that you also create) named components.Component1, components.Component2, and components.Component3.
// Derive a class Stem from Root that also contains an instance of each “component.”
// All classes should have default constructors that print a message about that class.
//Exercise 10:   (1) Modify the previous exercise so that each class only has non-default constructors.

//Q:What will be, if you will use it in other package?
//A:I make constructors public

public class Runner {
    public static void main(String[] args) {
        //Root root = new Root((float) 1.22);
        Stem stem = new Stem(3.14);
        System.out.println();
    }
}
