import java.util.ArrayList;
import java.util.List;

public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        s = str;
        created.add(s);
        for (String s2 : created) {
            if (s2.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public int hashCode() {
        int res = 17;
        if (s != null) {
            res = 37 * res + s.hashCode();
        }

        return res;
    }

    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString) o).s) && s != null && id == ((CountedString) o).id;
    }

    @Override
    public String toString() {
        return "CountedString{" +
                "s='" + s + '\'' +
                ", id=" + id +
                " , hashCode= " + hashCode() +
                '}';

    }
}
