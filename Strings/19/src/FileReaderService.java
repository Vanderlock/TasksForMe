import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderService {

    public static final String COMMENTS_REGEX = "(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)";
    public static final String STRINGS_REGEX = "\".*?\"";
    public static final String IMPORT_CLASS_NAME_REGEX = "import.*([A-Z][a-z]+)";
    public static final String IDENTIFICATION_CLASS_NAME_REGEX = "\\s*class (\\w+)";
    public static final String NEW_OBJECT_CLASS_NAME_REGEX = "new\\s+([A-Z]\\w+)";
    public static final String STATIC_CALL_CLASS_NAME_REGEX = "\\s+([A-Z]\\w+)\\.";


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

    public static List<String> getClassNamesList(String regEx, String source) {

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(source);
        List<String> classNamesList = new ArrayList<>();
        while (matcher.find()) {
            classNamesList.add(matcher.group(1));
        }

        return classNamesList;
    }

}
