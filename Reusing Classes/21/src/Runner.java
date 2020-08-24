//Exercise 21:   (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method.


public class Runner {
    public static void main(String[] args) {
        C c = new C();
        c.f();
        B b = new B();
        b.f();
        A a = new A();
        a.f();
    }
}
