public class Runner {

    static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 20;//entered value
        if (n <= 0){
            System.out.println("The entered value cannot be negative or zero. Calculations are impossible");
        }else{
            System.out.println("Fibonacci number sequence for " + n + ": ");
            for (int i = 0; i < n ; i++) {
                System.out.println(fibonacci(i));
            }
        }

    }
}
