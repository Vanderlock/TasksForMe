import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]) {
        String unadornedClassRE = "^\\s*class (\\w+)";

        String doubleIdentifierRE = "\\b(\\w+)\\s+\\1\\b";

//    MyThread myThread = new MyThread("First");
//    MyThread myThread2 = new MyThread("Second");
//    myThread.start();
//    myThread2.start();

        Pattern classPattern = Pattern.compile(unadornedClassRE);
        Pattern doublePattern = Pattern.compile(doubleIdentifierRE);
        Matcher classMatcher, doubleMatcher;

        Thread myThread = new Thread("First");
        Thread myThread2 = new Thread("Second");

        String line = " class MainClass";
        classMatcher = classPattern.matcher(line);
        doubleMatcher = doublePattern.matcher(line);

        if (classMatcher.find()) {
            System.out.println("The class [" + classMatcher.group(1) + "] is not public");
        }

        while (doubleMatcher.find()) {
            System.out.println("The word \"" + doubleMatcher.group(1) + "\" occurs twice at position "
                    + doubleMatcher.start());
        }

    }
}
