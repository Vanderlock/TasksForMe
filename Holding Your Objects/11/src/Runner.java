//Exercise 11:   (2) Write a method that uses an Iterator to step through a Collection and print the toString( )
// of each object in the container. Fill all the different types of Collections
// with objects and apply your method to each container


import java.util.*;

public class Runner {


    public static void main(String[] args) {



        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3));
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(5,6,7));
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(9,23,45));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(Arrays.asList(245,3446,3456));

        printCollection(arrayList);
        printCollection(linkedList);
        printCollection(hashSet);
        printCollection(linkedHashSet);
        
    }
    static void printCollection(Collection c){
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() +  ";");

        }
        System.out.println();
    }

}
