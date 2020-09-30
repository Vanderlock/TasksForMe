import java.util.HashMap;
import java.util.Map;


public class ClassTypeCapture<T> {


    Map<String, Class<?>> map = new HashMap<>();

    Object createNew(String name) {
        Class<?> aClass = map.get(name);
        try {
            return aClass.newInstance();
        } catch (Exception e) {
            System.err.println("Class not found");
        }
        return null;
    }

    void addType(String name, Class<?> kind) {
        map.put(name, kind);
    }


}
