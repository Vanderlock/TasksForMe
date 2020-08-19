// (2) Write a method that takes a vararg String array.
// Verify that you can pass either a comma-separated list of Strings or a String[] into this method.


public class Runner {
    static void print(String... args) {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        print("Hello", "my", "name", "is", "Valentin,");
        print(new String[]{"i`m", "26", "years old"});
    }
}
