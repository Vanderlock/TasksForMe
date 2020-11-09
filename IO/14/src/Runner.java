
import java.io.*;


public class Runner {
    private static final String IN_FILE = "src/bookExamples/BufferedInputFile.java";
    private static final String NON_BUF_OUT = "src/resources/BufferedInputFile.txt";
    private static final String BUF_OUT = "src/resources/BufferedInputFile2.txt";

    public static long test(Writer out) {
        long result = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(new File(IN_FILE)))) {
            int lineCount = 1;
            String s;
            long begin;
            while ((s = in.readLine()) != null) {
                begin = System.nanoTime();
                for (int i = 0; i < 10000; i++) {
                    out.write(lineCount++ + ": " + s);
                }
                result += (System.nanoTime() - begin);
            }
            out.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return result;


    }

    public static void main(String[] args) {
        long timeBuffer = 0;
        long timeNot = 0;
        for (int i = 0; i < 20; i++) {
            try {
                FileWriter fileOut = new FileWriter(NON_BUF_OUT);
                BufferedWriter bufferedOut = new BufferedWriter(new FileWriter(BUF_OUT));
                if (i >= 5) {
                    timeBuffer += test(bufferedOut);
                    timeNot += test(fileOut);
                }
            } catch (IOException e) {
                e.getMessage();
            }

        }
        System.out.println("Buffered time:    " + timeBuffer / 100);
        System.out.println("Not buffered time:    " + timeNot / 100);
    }
}
