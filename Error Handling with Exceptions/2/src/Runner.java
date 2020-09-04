//Exercise 2:   (1) Define an object reference and initialize it to null.
// Try to call a method through this reference.
// Now wrap the code in a try-catch clause to catch the exception.



public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = null;

        try {
            cat.say();
        } catch (NullPointerException e){
            System.err.println("Catch exception");
            System.err.println(e);
        }

    }
}
