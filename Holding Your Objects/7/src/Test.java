public class Test {
    static int counter = 1;
    int id = counter++;
    //auto add integers to arr (1 - infinity)
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
