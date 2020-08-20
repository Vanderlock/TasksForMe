//Exercise 3:   (2) Create two packages: debug and debugoff,
// containing an identical class with a debug( ) method.
// The first version displays its String argument to the console, the second does nothing.
// Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect





import static test.debug.Debug.debug;
import static test.debugoff.Debug.debug;

public class Runner {
    public static void main(String[] args) {
        debug("ArgDebug");
        debug();


    }
}
