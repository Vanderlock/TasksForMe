public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    final D FOURTH;

    public FourTuple(A FIRST, B SECOND, C THIRD, D FOURTH) {
        super(FIRST, SECOND, THIRD);
        this.FOURTH = FOURTH;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                " FIRST=" + FIRST +
                ", SECOND=" + SECOND +
                ", THIRD=" + THIRD +
                ", FOURTH=" + FOURTH +
                '}';
    }
}
