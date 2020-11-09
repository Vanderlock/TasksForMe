import bookExamples.ProcessFiles;

import java.util.*;
import java.io.*;
import java.text.*;

public class Runner {

    public static void filterByModifyDate(String[] args, String date) {
        new ProcessFiles(new ProcessFiles.Strategy() {
            private final long time = getNanoTime(date);

            public void process(File file) {
                try {
                    if (file.lastModified() > time) {
                        System.out.println(file + "\t |Last Modified: " + getFormatDate(file.lastModified()));
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }, "java").start(args);
    }

    public static long getNanoTime(String date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date myDate = dateFormat.parse(date);
            return myDate.getTime();
        } catch (ParseException pe) {
            System.err.println("Error with parsing Date!");
        }
        return 0L;
    }

    public static String getFormatDate(long milliTime) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return df.format(milliTime);
    }

    public static void main(String[] args) {
        filterByModifyDate(args, "2020-09-29");
    }
}
