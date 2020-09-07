//Exercise 18:   (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code.
// Extract the pairs, sort by key, and place the result into a LinkedHashMap.
// Show that the insertion order is maintained.


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Marley",new Cat(0));
        cats.put("Sylvester",new Cat(1));
        cats.put("Garfield",new Cat(2));
        cats.put("Hobbes",new Cat(3));
        cats.put("Remi",new Cat(4));
        cats.put("Belle",new Cat(5));
        cats.put("Charlotte",new Cat(6));

        System.out.println(cats);
        System.out.println("////////////////////");
        Set<String> sortKey = new TreeSet<String>(cats.keySet());
        System.out.println(sortKey);
        Map<String,Cat> sortCat = new LinkedHashMap<String, Cat>();
        for (String s : sortKey) {
            System.out.println("Add " + s + " ; ");
            sortCat.put(s,cats.get(s));
        }
        System.out.println(sortCat);


    }
}
