import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderService {
    public static String getFileSource(String filePath) {
        String fileSource = "";
        try (BufferedReader objReader = new BufferedReader(new FileReader(new File(filePath)))) {
            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                fileSource += strCurrentLine + "\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileSource;
    }

    public static String getClearSource(String regEx, String source) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(source);
        String result = matcher.replaceAll("");


        return result;
    }

    public static String getValues(String regEx, String source) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(source);
        String result = "";
        while (matcher.find()) {
            result += matcher.group() + "\n";
        }


        return result;
    }
    public static void getClassSource(){

    }


}
