////Exercise 4:   (2) Add a method to the class Sequence.SequenceSelector
//// that produces the reference to the outer class Sequence.


import interfaces.Selector;

public class Runner {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(7);
        for (int i = 0; i < 7; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
        ((Sequence.SequenceSelector) selector).sequence().test();
    }
}
