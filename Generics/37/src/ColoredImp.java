import java.awt.*;
import java.util.Random;

public class ColoredImp implements Colored{
    static Random rnd = new Random(47);
    final Color clr = new Color(rnd.nextInt(16777216));
    public Color getColor() {
        return clr;
    }
}
