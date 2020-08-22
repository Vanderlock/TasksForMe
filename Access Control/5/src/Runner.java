//Exercise 5:   (2) Create a class with public, private, protected, and package-access fields and method members.
// Create an object of this class and see what kind of compiler messages you get when you try to access all the class members.
// Be aware that classes in the same directory are part of the “default” package.


public class Runner {
    public static void main(String[] args) {
        Test test = new Test();

        test.printA();
        test.printB();
        //test.printC(); private, can`t use this
        test.printD();
        test.a = 11;
        test.b = 22;
        //test.c = 33; private, can`t use this
        test.d = 44;
        test.printA();
        test.printB();
        //test.printC(); private, can`t use this
        test.printD();

        Test test2 = new Test();
        test2.setA(20);
        test2.setB(30);
        test2.setC(40);
        test2.setD(50);
        System.out.println(test2.getA());
        System.out.println(test2.getB());
        System.out.println(test2.getC());
        System.out.println(test2.getD());
    }
}
