//Exercise 10: (2) Modify Exercise 8 to take additional command-line arguments of words
//to find in the file. Print all lines in which any of the words match.

import java.util.*;
import java.io.*;


public class Runner {
    public static void inversePrint(File file, String inWord) {
        LinkedList<String> list = new LinkedList<>();
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] words = line.split("[\\W]+");
                if (words.length > 0) {
                    for (String word : words) {
                        if (word.toLowerCase().equals(inWord)) {
                            list.add(line);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bf != null) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(--size));
        }
    }

    public static void main(String[] args) {
        System.out.println("args: resources yesterday\n");
        if (args.length != 2) {
            System.out.println("Please check the args!");
        } else {
            Runner.inversePrint(new File(args[0]), args[1]);
        }
    }
}