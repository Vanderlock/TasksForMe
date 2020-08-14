public class Runner {

    static void fibonacci(int a){
        int buff;
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci number " + a + " =\n" + num1 + "\n" + num2 + " ");
        for (int i = 2; i < a; ++i) {
            buff = num1 + num2;
            System.out.println(buff);
            num1 = num2;
            num2 = buff;
        }
    }
    public static void main(String[] args) {
        fibonacci(5);
    }
}
