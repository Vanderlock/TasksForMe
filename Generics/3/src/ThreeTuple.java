public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    final C THIRD;

    public ThreeTuple(A FIRST, B SECOND, C THIRD) {
        super(FIRST, SECOND);
        this.THIRD = THIRD;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                " FIRST=" + FIRST +
                ", SECOND=" + SECOND +
                ", THIRD=" + THIRD +
                '}';
    }
}
