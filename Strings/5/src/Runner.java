//Exercise 5: (5) For each of the basic conversion types in the above table, write the most
//complex formatting expression possible. That is, use all the possible format specifiers
//available for that conversion type.


import sun.applet.Main;

import java.math.BigInteger;
import java.util.Formatter;

public class Runner {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        char k = 'k';
        formatter.format("%-3s %-3S %-3c %-3C %-5b %-5B %-3h %-3H%%\n", k, k, k, k, k, k, k, k);

        int v = 121;
        System.out.println("int v = 121");
        formatter.format("%-4s000  %-4S000 %-4d000 %-4c %-4C %-5b %-5B %-4x%-4X%-4h%-4H%%\n", v, v, v, v, v, v, v, v, v, v, v);

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("BigInteger w = 50000000000000");
        formatter.format("%-15s %-15S %-5b %-5B %-15x %-15X %-5h %-5H%%\n", w, w, w, w, w, w, w, w);

        double x = 179.543;
        System.out.println("double x = 179.543");
        formatter.format("%-8s %-8S %-5b %-5B %-15f %-15e %-15E %-12h %-12H%%\n", x, x, x, x, x, x, x, x, x);

        boolean z = false;
        System.out.println("boolean z = false");
        formatter.format("%-7s %-7S %-7b %-7B %-7h %-7H%%\n", z, z, z, z, z, z);

        Runner runner = new Runner();
        System.out.println("Runner runner = new Runner()");
        formatter.format("%-20s %-20S %-5b %-5B %-10h %-10H%%\n", runner, runner, runner, runner, runner, runner);
    }
}
