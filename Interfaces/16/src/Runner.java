//Exercise 16:   (3) Create a class that produces a sequence of chars.
// Adapt this class so that it can be an input to a Scanner object.


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedRandomChars(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next() + " ");
        }
    }
}
