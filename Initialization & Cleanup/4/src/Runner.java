//Exercise 3:   (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
// Create an object of this class.
//Exercise 4:  (1) Add an overloaded constructor to the previous exercise
// that takes a String argument and prints it along with your message.


public class Runner {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message("overloaded constructor");
    }
}
