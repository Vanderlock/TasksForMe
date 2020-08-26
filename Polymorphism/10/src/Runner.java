//Exercise 10:   (3) Create a base class with two methods. In the first method, call the second method.
// Inherit a class and override the second method. Create an object of the derived class,
// upcast it to the base type, and call the first method. Explain what happens.



public class Runner {
    public static void main(String[] args) {
        B test = new B();
        test.f(); //automatic upgrade to base-class to call base-class method a.f() which,by polymorphism, will call the derived-class method b.g()

    }
}
