import interfaces.Selector;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sequence {
    ArrayList<Object> items = new ArrayList<Object>();
    void add(Object x){
        items.add(x);
    }

    class SequenceSelector implements Selector {
        int i = 0;
        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            i++;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
}
