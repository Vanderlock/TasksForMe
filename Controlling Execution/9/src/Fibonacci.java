//Exercise 9:
//        (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
//        where each number (from the third on) is the sum of the previous two.
//        Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning, e.g.,
//        If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
public class Fibonacci {

    static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n -1 ) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        if (args.length != 0)
        {
            try {
                int n = Integer.parseInt(args[0]);
                if (n <= 0){
                    System.out.println("The entered value cannot be negative or zero. Calculations are impossible");
                }else{
                    System.out.println("Fibonacci number sequence for " + n + ": ");
                    for (int i = 1; i <= n ; i++) {
                        System.out.println(fibonacci(i));
                    }
                }
            }catch (Exception exception){
                System.err.println("Error: The entered data type can only be integer");
            }
        }
    }
}
