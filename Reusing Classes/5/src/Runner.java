//Exercise 5:   (1) Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
// Inherit a new class called C from A, and create a member of class B inside C.
// Do not create a constructor for C.
// Create an object of class C and observe the results.


public class Runner {
    public static void main(String[] args) {
        C c = new C();
        //
        //construction begins with base class A.
        // Therefore, it is initialized before it is available to the constructor of the derived class.
        // Likewise with B. When creating object "c". Both constructors work out

        //Output:
        //Constructor A
        //Constructor B
    }
}
