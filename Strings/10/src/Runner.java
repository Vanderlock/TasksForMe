//Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the
//following expressions will find a match


//^Java
//\Breg.*
//n.w\s+h(a|i)s
//s?
//s*
//s+
//s{4}
//S{1}.
//s{0,3}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    static String addChar(String str, char ch1, int position1, char ch2, int position2) {

        StringBuilder sb = new StringBuilder(str);
        sb.insert(position1, ch1);
        sb.insert(position2 + 1, ch2);
        return sb.toString();
    }

    static void test(String regex, String text) {

        System.out.println("Run test for RegEx: " + regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            matcher.reset();
            int count = 0;
            while (matcher.find()) {
                text = addChar(text, '[', matcher.start() + count, ']', matcher.end() + count);
                count = count + 2;
            }
            System.out.println(text);
        } else {
            System.out.println("Match for |" + regex + "| not find");
        }
    }


    public static void main(String[] args) {
        final String text = "Java now has regular expressions";

        test("^Java", text);
        test("\\breg.*", text);
        test("n.w\\s+h(a|i)s", text);
        test("s?", text);
        test("s*", text);
        test("s+", text);
        test("s{4}", text);
        test("S{1}.", text);
        test("s{0,3}", text);

    }
}
