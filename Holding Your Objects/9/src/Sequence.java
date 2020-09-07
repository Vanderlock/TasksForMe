import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    ArrayList<String> items = new ArrayList<String>();
    void add(String x){
        items.add(x);
    }
    Iterator iterator(){
        return items.iterator();
    }
}
