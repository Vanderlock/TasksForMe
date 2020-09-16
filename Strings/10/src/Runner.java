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

    static void test(String regex, String text) {
        System.out.println("Run test for RegEx: " + regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            matcher.reset();
            while (matcher.find()) {
                System.out.println(("Match |" + matcher.group() +
                        "| position - " + matcher.start() + "-" +
                        (matcher.end() - 1)));
            }
        } else {
            System.out.println("Match for |" + regex + "| not find");
        }


    }


    public static void main(String[] args) {
        String text = "Java now has regular expressions";
        System.out.println(text);
        test("^Java", text);
        test("\\Breg.*", text);
        test("n.w\\s+h(a|i)s", text);
        test("s?", text);
        test("s*", text);
        test("s+", text);
        test("s{4}", text);
        test("S{1}.", text);
        test("s{0,3}", text);

    }
}
