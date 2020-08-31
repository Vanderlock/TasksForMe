import java.util.Random;

public class RandomChars {
    static Random random = new Random();
    public char next(){
        return (char)random.nextInt(100);
    }
}
