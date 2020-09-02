//Exercise 16:   (5) Create a Set of the vowels.
// Working from UniqueWords.Java, count and display the number of vowels in each input word,
// and also display the total number of vowels in the input file.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Runner {
    static void vowelCounter(Set<String> st){
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        for (String s: st) {
            int count = 0;
            for (Character v:s.toCharArray()) {
                if(vowels.contains(v)){
                    count++;
                    allVowels++;
                }
            }
            System.out.println(s + ": " + count + " vowels ");
        }
        System.out.println(allVowels + " Total vowels");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String FILENAME = "src/test.txt";
        Set<String> words = new TreeSet<String>();
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

        System.out.println("Now inter you words in console. To exit enter /exit/");
        Set<String> inputWords = new TreeSet<String>();
        while (true){
            String data = reader.readLine();
            if (data.equalsIgnoreCase("exit")){
                break;
            }else {
                inputWords.add(data);
            }
        }
        System.out.println("Entered words from console: ");
        System.out.println(inputWords);

        vowelCounter(inputWords);
        System.out.println("VowelCounter for consoles input");
        System.out.println("|||||||||||||||||||||||||||||||||||");


        vowelCounter(words);
        System.out.println("Total vowels in text file ");
    }
}
