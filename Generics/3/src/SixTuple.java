public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    final F SIXTH;

    public SixTuple(A FIRST, B SECOND, C THIRD, D FOURTH, E FIFTH, F SIXTH) {
        super(FIRST, SECOND, THIRD, FOURTH, FIFTH);
        this.SIXTH = SIXTH;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                " FIRST=" + FIRST +
                ", SECOND=" + SECOND +
                ", THIRD=" + THIRD +
                ", FOURTH=" + FOURTH +
                ", FIFTH=" + FIFTH +
                ", SIXTH=" + SIXTH +
                '}';
    }
}
