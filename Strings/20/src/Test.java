
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String string;

    final String REG_LONG = "-?\\d{8,19}";
    final String REG_STR = "\\D[a-zA-Z]+";
    final String REG_FLOAT = "-?\\d+.\\d+[fF]";
    final String REG_DOUBLE = "-?\\d+\\.\\d+(?=\\s|$)";
    final String REG_INT = "(?<=^|\\s)(-?\\d{1,7})(?=\\s|$)";


    //(?<=\s)\D[a-zA-Z]+


    public Test(String string) {

        string = string.replaceAll(",", ".");

        Pattern patternForLong = Pattern.compile(REG_LONG, Pattern.MULTILINE);
        Matcher matcherForLong = patternForLong.matcher(string);
        Pattern patternForFloat = Pattern.compile(REG_FLOAT, Pattern.MULTILINE);
        Matcher matcherForFloat = patternForFloat.matcher(string);
        Pattern patternForString = Pattern.compile(REG_STR, Pattern.MULTILINE);
        Matcher matcherForString = patternForString.matcher(string);
        Pattern patternForDouble = Pattern.compile(REG_DOUBLE, Pattern.MULTILINE);
        Matcher matcherForDouble = patternForDouble.matcher(string);
        Pattern patternForInt = Pattern.compile(REG_INT, Pattern.MULTILINE);
        Matcher matcherForInt = patternForInt.matcher(string);

        try {
            while (matcherForLong.find()) {
                aLong = Long.parseLong(matcherForLong.group());
            }
            while (matcherForFloat.find()) {
                aFloat = Float.parseFloat(matcherForFloat.group());
            }
            while (matcherForString.find()) {
                this.string = matcherForString.group();
            }
            while (matcherForDouble.find()) {
                aDouble = Double.parseDouble(matcherForDouble.group());
            }
            while (matcherForInt.find()) {
                anInt = Integer.parseInt(matcherForInt.group());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e);

        }


    }

    @Override
    public String toString() {
        return "Test{" +
                "int=" + anInt +
                ", long=" + aLong +
                ", float=" + aFloat +
                ", double=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }


}
