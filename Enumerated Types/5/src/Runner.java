//Exercise 5: (4) Modify control/VowelsAndConsonants.java so that it uses three
//enum types: VOWEL, SOMETIMES_A_VOWEL, and CONSONANT. The enum
//constructor should take the various letters that describe that particular category. Hint: Use
//varargs, and remember that varargs automatically creates an array for you.
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for(int i = 0; i < 20; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + " - ");
            System.out.println(Characters.getCategory((char)c).toString());
        }
    }
}
