package Interfaces;

public interface Interface {
    String f();
    String g();
    class Nested {
        public static void testInterface(Interface i){
            System.out.println(i.f() + i.g());
        }
    }
}
