public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    final E FIFTH;

    public FiveTuple(A FIRST, B SECOND, C THIRD, D FOURTH, E FIFTH) {
        super(FIRST, SECOND, THIRD, FOURTH);
        this.FIFTH = FIFTH;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                " FIRST=" + FIRST +
                ", SECOND=" + SECOND +
                ", THIRD=" + THIRD +
                ", FOURTH=" + FOURTH +
                ", FIFTH=" + FIFTH +
                '}';
    }
}
