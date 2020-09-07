import Interfaces.U;

public class A {
    U buildU(){
        return new U() {
            @Override
            public void f() {
                System.out.println("f()");
            }
            @Override
            public void g() {
                System.out.println("g()");
            }
            @Override
            public void print(){
                System.out.println("print()");
            }
        };
    }
}
