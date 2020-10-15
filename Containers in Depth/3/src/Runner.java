//Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
//that the Set ends up with only one of each instance. Try this with HashSet,
//LinkedHashSet, and TreeSet.


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //create list for demonstrate
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.addAll(Countries.names(5));

        }
        System.out.println("The same data has been added 3 times to ArrayList:\n" + arrayList);

        Set<String> linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 3; i++) {
            linkedHashSet.addAll(Countries.names(5));
        }
        System.out.println("The same data has been added 3 times to LinkedHashSet:\n" + linkedHashSet);

        Set<String> hashSet = new HashSet();
        for (int i = 0; i < 3; i++) {
            hashSet.addAll(Countries.names(5));
        }
        System.out.println("The same data has been added 3 times to HashSet:\n" + hashSet);

        Set<String> treeSet = new TreeSet();
        for (int i = 0; i < 3; i++) {
            treeSet.addAll(Countries.names(5));
        }
        System.out.println("The same data has been added 3 times to TreeSet:\n" + treeSet);


    }

}
