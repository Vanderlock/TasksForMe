import java.util.Comparator;

class CompBerylliumSphereComparator
        implements Comparator<BerylliumSphere> {
    public int compare(BerylliumSphere c1, BerylliumSphere c2) {
        return (Integer.compare(c2.id, c1.id));
    }
}