import java.util.Random;

public class Test {
    static Random random = new Random(47);
    final int i1 = random.nextInt(20);
    static final int i2 = random.nextInt(20);


    Test() {

        System.out.println("Test()");
    }
}
