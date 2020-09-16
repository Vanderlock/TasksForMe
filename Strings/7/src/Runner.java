//Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource,
//write and test a regular expression that checks a sentence to see that it begins with a capital
//letter and ends with a period.


public class Runner {

    public static void matches(String string) {
        if (string.matches("^[A-Z].*\\.")) {
            System.out.println("The sentence has a capital letter at the beginning and a period at the end");
        } else {
            System.out.println("incorrect");
        }
    }

    public static void main(String[] args) {


        matches("In a crooked little town, they were lost and never found.");
        matches("Fallen leaves, fallen leaves, fallen leaves... on the ground.");
        matches("run away before you drown, or the streets will beat you down.");
        matches("Fallen leaves, fallen leaves, fallen leaves... on the ground");


    }
}
