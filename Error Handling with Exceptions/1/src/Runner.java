//Exercise 1:   (2) Create a class with a main( ) that throws an object of class Exception inside a try block.
// Give the constructor for Exception a String argument.
// Catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.


public class Runner {
    static void f() throws MyException{
        System.out.println("Trow myException");
        throw new MyException("method f");
    }
    public static void main(String[] args) {
        try{
           f();
        }catch (MyException myException){
            System.err.println("Caught MyException");
        }finally {
            System.out.println("Finally");
        }
    }
}
