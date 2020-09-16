//Exercise 20: (2) Create a class that contains int, long, float and double and String
//fields. Create a constructor for this class that takes a single String argument, and scans that
//string into the various fields. Add a toString( ) method and demonstrate that your class
//works correctly.


import java.util.InputMismatchException;

public class Runner {
    public static void main(String[] args) {
            Test test = new Test("123 23452345 2345,2 223523452345234523452 Hello World");
            System.out.println(test.toString());



    }
}
