//Exercise 19:   (2) Create a class with a blank final reference to an object. Perform the initialization of the blank final inside all constructors.
// Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized.


//Q: It will work in other class runner?
//A: Yes if i change field "Cup" to non private

public class BlankFinal {
    final Cup cup; // Blank final reference


    // Blank final MUST be initialized in the constructor:
    public BlankFinal() {
        cup = new Cup(1); // Initialize blank final reference
    }
    public BlankFinal(int x) {
        cup = new Cup(x); // Initialize blank final reference
    }

    public static void main(String[] args) {

        BlankFinal b1 = new BlankFinal();
        BlankFinal b2 = new BlankFinal(500);
        // b1.cup = new Cup(2); // Errors: cannot assign values
        // b2.cup = new Cup(3); // to final variables p
        System.out.println("b1.cup: " + b1.cup);
        System.out.println("b2.cup: " + b2.cup);

    }
}
