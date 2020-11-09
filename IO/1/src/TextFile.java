import java.io.*;
import java.util.*;


public class TextFile extends ArrayList<String> {
    // Read a file as a single string:
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            try (BufferedReader in = new BufferedReader(new FileReader(
                    new File(fileName).getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return sb.toString();
    }

    // Read a file, split by any regular expression:
    public TextFile(String fileName, String splitter) {

        super(Arrays.asList(read(fileName).split(splitter)));
        // Regular expression split() often leaves an empty
        // String at the first position:
        if(get(0).equals("")) remove(0);
    }


}