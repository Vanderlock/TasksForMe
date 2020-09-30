public class TwoTuple<A, B> {
    final A FIRST;
    final B SECOND;

    public TwoTuple(A FIRST, B SECOND) {
        this.FIRST = FIRST;
        this.SECOND = SECOND;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "FIRST=" + FIRST +
                ", SECOND=" + SECOND +
                '}';
    }
}
