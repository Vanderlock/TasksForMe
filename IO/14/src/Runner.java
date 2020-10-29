
//Exercise 14: (2) Starting with BasicFileOutput.java, write a program that compares
//the performance of writing to a file when using buffered and unbuffered I/O.

import java.io.*;


public class Runner {
    static String file = "Runner.out";
    static String file2 = "Runner.out";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src\\Runner.java")));
        // Buffered writer:
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        long start = System.nanoTime();
        while((s = in.readLine()) != null ) {
            out.println(lineCount++ + ": " + s);
        }
        long duration = System.nanoTime() - start;
        out.close();

        BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("src\\Runner.java")));
        // Unbuffered writer:
        PrintWriter out2 = new PrintWriter(new FileWriter(file2));
        lineCount = 1;
        String s2;
        long start2 = System.nanoTime();
        while((s2 = in2.readLine()) != null ) {
            out2.println(lineCount++ + ": " + s2);
        }
        long duration2 = System.nanoTime() - start2;
        out2.close();
        System.out.println("file: \n" + BufferedInputFile.read(file));
        System.out.println("file2: \n" + BufferedInputFile.read(file2));
        System.out.println("Buffered write:   " + duration + " nanoseconds");
        System.out.println("Unbuffered write: " + duration2 + " nanoseconds");



    }

}
