//Exercise 20: (2) Create a class that contains int, long, float and double and String
//fields. Create a constructor for this class that takes a single String argument, and scans that
//string into the various fields. Add a toString( ) method and demonstrate that your class
//works correctly.


public class Runner {
    public static void main(String[] args) {
        Test test = new Test(" 123 3.14 -234.52f 2235234523452345234 -123234.52f Hello World");
        System.out.println(test.toString());
        Test test1 = new Test("123321 3.12f 31234563456  3pijkjh 123.412 fdwesg ");
        System.out.println(test1.toString());
        Test test2 = new Test("String -123 -12345678 -2133,22F 22,32");
        System.out.println(test2.toString());
    }
}
