//Exercise 7: (4) Create both an ArrayList and a LinkedList, and fill each using the
//Countries.names( ) generator. Print each list using an ordinary Iterator, then insert one
//list into the other by using a Listlterator, inserting at every other location. Now perform the
//insertion starting at the end of the first list and moving backward. 


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Countries.names(10));
        LinkedList<String> linkedList = new LinkedList<>(Countries.names(20).subList(10, 20));
        System.out.println("arraylist:");
        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            System.out.print(" [" + iterator.next() + "] ");
            if (!iterator.hasNext()) {
                System.out.println();
            }
        }

        System.out.println("linkedlist");
        for (Iterator<String> iterator = linkedList.iterator(); iterator.hasNext(); ) {
            System.out.print(" [" + iterator.next() + "] ");
            if (!iterator.hasNext()) {
                System.out.println();
            }
        }
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");

        int arrayListIndex = 0;
        System.out.println("combine two lists, performing insertion through position");
        for (ListIterator<String> listIterator2 = linkedList.listIterator(); listIterator2.hasNext(); ) {
            arrayList.add(arrayListIndex, listIterator2.next());
            arrayListIndex += 2;
        }
        System.out.println("arrayList = " + arrayList);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println("insert is done from the end the first list and moves backward");
        arrayListIndex = 0;
        for (ListIterator<String> listIterator2 = linkedList.listIterator(linkedList.size()); listIterator2.hasPrevious(); ) {
            arrayList.add(arrayListIndex, listIterator2.previous());
            arrayListIndex += 2;
        }
        System.out.println("arrayList = " + arrayList);

    }
}
