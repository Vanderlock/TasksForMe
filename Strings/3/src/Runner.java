//Exercise 3: (1) Modify Turtle.java so that it sends all output to System.err.


import java.io.PrintStream;
import java.util.Formatter;

public class Runner {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.err);
        Turtle tommy = new Turtle("Tommy", formatter);
        Turtle terry = new Turtle("Terry", formatter);
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
