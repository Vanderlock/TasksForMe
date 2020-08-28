import java.util.Random;

public class RandomChars {
    private static Random random = new Random();
    public char next(){
        return (char)random.nextInt(100);
    }
}
