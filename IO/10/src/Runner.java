//Exercise 10: (2) Modify Exercise 8 to take additional command-line arguments of words
//to find in the file. Print all lines in which any of the words match.


//Exercise 8: (1) Modify Exercise 7 so that the name of the file you read is provided as a
//command-line argument.

//Exercise 7: (2) Open a text file so that you can read the file one line at a time. Read each
//line as a String and place that String object into a LinkedList. Print all of the lines in the
//LinkedList in reverse order.


import java.io.*;
import java.util.*;


public class Runner {
    public static String reverseAndFind(String [] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        String s;
        List<String> find = new ArrayList<>(Arrays.asList(args));
        find.remove(0); // Remove the file name
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder(); // For output String
        while((s = in.readLine()) != null) {
            // List of words in line:
            List<String> line = Arrays.asList(s.split("\\W+"));
            // Find lines with word(s) in common:
            if(!(Collections.disjoint(line, find))) {
                list.add(s); // Add to list
            }
        }
        while(list.peekLast() != null) {
            sb.append(list.pollLast()).append("\n");
        }
        in.close();
        return sb.toString();


    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter 2 args:\n" +
                "\t1) File name\n" +
                "\t2) Words to find\n");
        if(args.length < 2) {
            System.out.println("NotEnough args: " + args.length + " entered.");
            System.exit(1);
        }else if (reverseAndFind(args).length()==0){
            System.out.println("No matches were found or the word was entered incompletely");
        }else {
            System.out.println("FoundLines: ");
            System.out.print(reverseAndFind(args));
        }


    }
}
