import java.io.IOException;
import java.nio.CharBuffer;

public class AdaptedRandomChars extends RandomChars implements Readable{
    int count;
    public AdaptedRandomChars(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0){
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
}
