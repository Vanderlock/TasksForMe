import java.util.Random;

public class Box implements Comparable<Box> {

    Random random = new Random();
    private final Integer integer = random.nextInt(101);

    @Override
    public int compareTo(Box o) {
        return integer.compareTo(o.integer);
    }

    @Override
    public String toString() {
        return Integer.toString(integer);
    }
}
