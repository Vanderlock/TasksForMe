import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    ArrayList<Object> items = new ArrayList<Object>();
    void add(Object x){
        items.add(x);
    }
    Iterator iterator(){
        return items.iterator();
    }
}
