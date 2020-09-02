//Exercise 14:   (3) Create an empty LinkedList<Integer>.
// Using a Listlterator, add Integers to the List by always inserting them in the middle of the List.


import java.util.LinkedList;
import java.util.ListIterator;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        add(linkedList,arr);
    }
    static void add(LinkedList<Integer> linkedList, Integer[] integer){
        for (Integer i : integer ) {
            ListIterator<Integer> li = linkedList.listIterator(linkedList.size()/2);
            li.add(i);
            System.out.println(linkedList);
        }
    }
}
