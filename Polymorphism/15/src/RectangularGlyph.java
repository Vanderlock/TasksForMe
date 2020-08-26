public class RectangularGlyph extends Glyph{
    private int length = 2;
    private int width = 4;
    RectangularGlyph(int l, int w) {
        length = l;
        width = w;
        System.out.println("RectangularGlyph.RectangularGlyph(), length = "
                + length + ", width = " + width);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), length = " + length
                + ", width = " + width);
    }
}
