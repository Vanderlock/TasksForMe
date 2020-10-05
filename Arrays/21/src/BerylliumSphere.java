

public class BerylliumSphere implements Comparable<BerylliumSphere> {
    static int counter;
    int id = counter++;

    public int compareTo(BerylliumSphere c2) {
        return (Integer.compare(this.id, c2.id));
    }

    public String toString() {
        return "BerylliumSphere " + id;
    }
}
