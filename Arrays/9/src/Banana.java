public class Banana {
    final long id;

    public Banana(int id) {
        this.id = id;
    }
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
