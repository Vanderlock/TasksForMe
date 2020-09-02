import java.util.Iterator;

//Exercise 9:   (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
public class Runner {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 1; i <= 5; i++) {
            sequence.add(Integer.toString(i));
        }
        sequence.add("Hello World");
        Iterator iterator = sequence.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
