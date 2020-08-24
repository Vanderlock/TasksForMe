public class A {
    static int i = printInit("A initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 500;
    }
}
