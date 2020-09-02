//Exercise 3:   (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it

import interfaces.Selector;

public class Runner {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
        sequence.add(10);
        sequence.add(11);
        sequence.add("Dog");
        sequence.add(13);
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
        sequence.add(14);
        sequence.add("Cat");
        sequence.add(16);
        sequence.add(17);
        sequence.add("Car");
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
