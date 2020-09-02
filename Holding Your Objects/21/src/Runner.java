//Exercise 21:   (3) Using a Map<String,Integer>, follow the form of UniqueWords.java
// to create a program that counts the occurrence of words in a file.
// Sort the results using Collections.sort( ) with a second argument of
// String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Runner {
    public static void main(String[] args) throws IOException {
            final String FILENAME = "src/test.txt";
            List<String> words = new ArrayList<String>();
            try{
                BufferedReader in = new BufferedReader(new FileReader(FILENAME));
                while(in.ready()){
                    String text = in.readLine();
                    String[] tmp = text.split("\\W+");
                    for(String s: tmp){
                        if(!s.isEmpty()){
                            words.add(s);
                        }
                    }
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("World without String.CASE_INSENSITIVE_ORDER  " + words);
            Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
            System.out.println("World with String.CASE_INSENSITIVE_ORDER  " + words);
            Map<String,Integer> wordCount = new LinkedHashMap<String, Integer>();
            Iterator iterator = words.iterator();
            int totalWords = 0;
            int temp = 1;
            while(iterator.hasNext()) {
                String s = (String)iterator.next();
                if(words.contains(s)) {
                    Integer count = wordCount.get(temp);
                    wordCount.put(s, temp);
                    temp++;
                    totalWords++;
                }



        }
        System.out.println();
        System.out.println("Word count: " + wordCount);
        System.out.println();
        System.out.println("Total words: " + totalWords);
    }
}
