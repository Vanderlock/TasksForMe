
//Exercise 26: (3) Modify strings/JGrep.java to use Java nio memorymapped files.


import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.regex.*;

public class Runner {
    public static void jgrep (String regex, String path) {
        try(FileChannel fc = new FileInputStream(regex).getChannel()) {
            Pattern p = Pattern.compile(path);
            ByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
            CharBuffer cb = Charset.forName(System.getProperty("file.encoding")).decode(buffer);
            String[] fileAsArray = cb.toString().split("\n");
            int index = 0;
            Matcher m = p.matcher("");
            for (String line : fileAsArray) {
                m.reset(line);
                while (m.find()) {
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }


        }catch (IOException e){
            e.getMessage();
        }

    }


    public static void main(String[] args)  {
        if (args.length < 2) {
            System.out.println("Enter in command line: java Runner Runner.java \\b[Ssct]\\w+");
            System.exit(0);
        }
        jgrep(args[0],args[1]);


    }
}
