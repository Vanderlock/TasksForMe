//Exercise 16:   (5) Create a Set of the vowels.
// Working from UniqueWords.Java, count and display the number of vowels in each input word,
// and also display the total number of vowels in the input file.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Runner {
    static void vowelCounter(Set<String> stringSet) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        for (String s : stringSet) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count++;
                }
            }
            allVowels += count;
            System.out.println(s + ": " + count + " vowels ");
        }
        System.out.println(allVowels + " Total vowels");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select 1 or 2");
        System.out.println("1 to read wordsFromFile");
        System.out.println("2 to read wordsFromConsole");
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1: {
                    Set<String> wordsFromFile = getWordsFromFile("src/test.txt");
                    vowelCounter(wordsFromFile);
                    break;
                }
                case 2: {
                    System.out.println("Now inter you words in console. To exit enter /exit/");
                    Set<String> wordsFromConsole = getWordsFromConsole();
                    vowelCounter(wordsFromConsole);
                    break;
                }
                default: {
                    System.err.println("There no such command");
                }

            }
        }else{
            System.out.println("Incorrect input message");
        }


    }

    private static Set<String> getWordsFromFile(String fileName) {

        Set<String> wordsFromFile = new TreeSet<>();
        try (BufferedReader buffFileReader = new BufferedReader(new FileReader(fileName))) {
            while (buffFileReader.ready()) {
                String text = buffFileReader.readLine();
                for (String s : text.split("\\W+")) {
                    if (!s.isEmpty()) {
                        wordsFromFile.add(s);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordsFromFile;
    }

    private static Set<String> getWordsFromConsole() {
        Set<String> inputWords = new TreeSet<>();

        try (BufferedReader buffConsoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String data = buffConsoleReader.readLine();
                if (data.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    inputWords.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputWords;
    }
}
