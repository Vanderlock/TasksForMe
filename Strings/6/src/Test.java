public class Test {
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;

    public Test(int i, long l, float f, double d) {
        this.anInt = i;
        this.aLong = l;
        this.aFloat = f;
        this.aDouble = d;
    }

    @Override
    public String toString() {
        return String.format("i = %d\nl = %d\nf = %.5g\nd = %.5g\n", anInt, aLong, aFloat, aDouble);
    }
}
