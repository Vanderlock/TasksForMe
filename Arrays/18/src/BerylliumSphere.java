public class BerylliumSphere {
    static int counter;
    int id = counter++;


    public void setId(int id) {
        this.id = id;
    }

    public String toString() { return "Sphere " + id; }
}
