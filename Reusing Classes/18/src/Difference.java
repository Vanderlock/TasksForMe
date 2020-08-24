import java.util.Random;

public class Difference {
    private String name;
    public Difference(String s) { name = s;  }
    static final Test sft = new Test(); // constant reference address
    private final Test ft = new Test();
    static final String SFS = "static final"; // class constant
    private final String fs = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt(); // class constant
    private final int fi = rand.nextInt();

    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

}
