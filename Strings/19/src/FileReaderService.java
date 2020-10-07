import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderService {




    public static String getFileSource(String filePath) {

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader objReader = new BufferedReader(new FileReader(new File(filePath)))) {
            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                stringBuilder.append(strCurrentLine).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
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
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group()).append("\n");
        }
        return stringBuilder.toString();
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
