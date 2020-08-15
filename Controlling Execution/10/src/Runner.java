public class Runner {
    static int a(int i) {
        return i/1000;
    }
    static int b(int i) {
        return (i%1000)/100;
    }
    static int c(int i) {
        return ((i%1000)%100)/10;
    }
    static int d(int i) {
        return ((i%1000)%100)%10;
    }
    static int combine(int i, int j) {
        return (i * 10) + j;
    }
    static void printRes (int i, int m, int n) {
        if(m * n == i) System.out.println(i + " = " + m + " * " + n + ";");
    }
    public static void main(String[] args) {
        for(int i = 1000; i <= 10000; i++) {
            printRes(i, combine(a(i), b(i)), combine(c(i), d(i)));
            printRes(i, combine(a(i), b(i)), combine(d(i), c(i)));
            printRes(i, combine(a(i), c(i)), combine(b(i), d(i)));
            printRes(i, combine(a(i), c(i)), combine(d(i), b(i)));
            printRes(i, combine(a(i), d(i)), combine(b(i), c(i)));
            printRes(i, combine(a(i), d(i)), combine(c(i), b(i)));
            printRes(i, combine(b(i), a(i)), combine(c(i), d(i)));
            printRes(i, combine(b(i), a(i)), combine(d(i), c(i)));
            printRes(i, combine(b(i), c(i)), combine(d(i), a(i)));
            printRes(i, combine(b(i), d(i)), combine(c(i), a(i)));
            printRes(i, combine(c(i), a(i)), combine(d(i), b(i)));
            printRes(i, combine(c(i), b(i)), combine(d(i), a(i)));
        }
    }
}
