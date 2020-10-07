//Exercise 5: (5) For each of the basic conversion types in the above table, write the most
//complex formatting expression possible. That is, use all the possible format specifiers
//available for that conversion type.




import java.math.BigInteger;
import java.util.Formatter;

public class Runner {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        boolean b = false;
        System.out.println("boolean: " + b);
        formatter.format("%2$-5.3b\n%-5.4B\n%-5s\n%-5S\n\n", b, b, b);
        char a = 'a';
        System.out.println("char: " + a);
        formatter.format("%2$-5c\n%-5C\n%-5.4b\n%-5.4B\n%-5h\n%-5H\n\n", a, a, a, a, a);
        double d = 345.678;
        System.out.println("double: " + d);
        formatter.format("%2$-5.4b\n%-5.4B\n%-5.2s\n%-5.2S\n%-5.2f\n%-5.2e\n%-5.2E\n\n" , d,d,d,d,d,d);
        float f = 345.6F;
        System.out.println("float: " + f);
        formatter.format("%-5.2e\n%-5.2E\n%2$-5.4b\n%-5.4B\n%-5.2s\n%-5.2S\n\n", f, f, f, f, f);
        int i = 120;
        System.out.println("int: " + i);
        formatter.format("%2$-5d\n%-5c\n%-5C\n%-5.4b\n%-5.4B\n%-5s\n%-5h\n%-5H\n\n", i, i, i, i, i, i, i);
        long l = (long)1234567890;
        System.out.println("long: " + l);
        formatter.format("%2$-5d\n%-5.4b\n%-5.4B\n%-5.3s\n%-5.3S\n\n", l, l, l, l);
        short s = (short)12345;
        System.out.println("short: " + s);
        formatter.format("%2$-5d\n%-5.4b\n%-5.4B\n%-5.4s\n%-5.4S\n\n", s, s, s, s);
        Runner r = new Runner();
        System.out.println("Runner r = new Runner();");
        formatter.format("%2$-5.4b\n%-5.4B\n%-15s\n%-15S\n%-15h\n\n", r, r, r, r);
    }
}
