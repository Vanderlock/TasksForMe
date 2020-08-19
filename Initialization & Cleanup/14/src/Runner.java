//Exercise 14:   (1) Create a class with a static String field that is initialized at the point of definition,
// and another one that is initialized by the static block.
// Add a static method that prints both fields and demonstrates that they are both initialized before they are used.


public class Runner {
    static Person person1 = new Person();
    static Person person2 = new Person();
    public static void main(String[] args) {
        System.out.println("main");
        Person.info();
        

    }

}
