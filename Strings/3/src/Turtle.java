import java.util.Formatter;

public class Turtle {
    String name;
    Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The turtle is at (%d,%d)\n", name, x, y);
    }
}
