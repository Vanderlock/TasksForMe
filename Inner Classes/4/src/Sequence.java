

import interfaces.Selector;


public class Sequence {
    private Object[] items;
    private int next = 0;
    public void test() {
        System.out.println("Sequence.test");
    }
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }
    class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
        // method to produce outer class reference:
        public Sequence sequence() {
            return Sequence.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
}