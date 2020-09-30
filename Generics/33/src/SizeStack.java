import java.util.ArrayList;

public class SizeStack<T> {
    ArrayList<T> storage = new ArrayList<>();

    int count() {
        return storage.size();
    }

    void push(T item) {
        storage.add(item);
    }

    T pop() {
        return storage.remove(storage.size() - 1);
    }
}
