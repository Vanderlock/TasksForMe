public class Runner {
    public static void main(String[] args) {
        String string = "Just a string";
        System.out.println("Bytes to storage this string: " + storage(string));

    }
    static int storage(String s){
        return s.length()*2;
    }
}
