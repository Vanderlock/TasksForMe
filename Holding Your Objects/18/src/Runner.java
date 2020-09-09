//Exercise 18:   (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code.
// Extract the pairs, sort by key, and place the result into a LinkedHashMap.
// Show that the insertion order is maintained.


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Marley", new Cat());
        cats.put("Sylvester", new Cat());
        cats.put("Garfield", new Cat());
        cats.put("Hobbes", new Cat());
        cats.put("Remi", new Cat());
        cats.put("Belle", new Cat());
        cats.put("Charlotte", new Cat());


        //cats
        for (Map.Entry<String, Cat> pair : cats.entrySet()) {
            //print HashMap
            System.out.println("Key " + pair.getKey() + "; Value " + pair.getValue() + "; HashCode " + pair.hashCode());

        }


        System.out.println("////////////////////");
        Set<String> sortKey = new TreeSet<String>(cats.keySet());
        System.out.println(sortKey);
        Map<String, Cat> sortCat = new LinkedHashMap<String, Cat>();
        for (String s : sortKey) {
            System.out.println("Add " + s + " ; ");
            sortCat.put(s, cats.get(s));
        }
        //sortCat
        for (Map.Entry<String, Cat> pair : sortCat.entrySet()) {
            //print LinkedHashMap
            System.out.println("Key " + pair.getKey() + "; Value " + pair.getValue() + "; HashCode " + pair.hashCode());

        }

    }
}
