
//Exercise 6: (5) Use ProcessFiles to find all the Java source-code files in a particular
//directory subtree that have been modified after a particular date.
import java.io.*;
import java.text.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        if(args.length != 2) {
            System.err.println("Usage: java Runner path(where is the java file) date(M/dd/yyyy)");
            return;
        }
        long tmp = 0;
        try {
            df.setLenient(false);
            tmp = df.parse(args[1]).getTime();
        } catch(ParseException pe) {
            pe.printStackTrace();
            return;
        }
        final long modTime = tmp;
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                if(modTime < file.lastModified()) {
                    System.out.println(file);
                }
            }
        }, "java").start(new String[] {args[0]});
    }
}
