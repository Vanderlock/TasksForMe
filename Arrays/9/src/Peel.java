public class Peel<T> {
    T fruit;


    public Peel(T fruit) {
        this.fruit = fruit;
    }
    public String toString() { return "Peel " + fruit.toString(); }
}
