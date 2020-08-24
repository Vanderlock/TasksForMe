//Exercise 23:   (2) Prove that class loading takes place only once.
// Prove that loading may be caused by either the creation of the first instance of that class or by the access of a static member.



public class B extends A {
    public void f() {

    };
    static int j = printInit("B initialized");

    public static void main(String[] args) {

    }
}
