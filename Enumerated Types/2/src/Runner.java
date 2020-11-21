//Exercise 2: (2) Instead of implementing an interface, make next( ) a static method.
//What are the benefits and drawbacks of this approach?


import bookExamples.CartoonCharacter;

public class Runner {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(CartoonCharacter.next());
        }
        // The advantage of the static method (next())
        // is that you don't need to instantiate the enumeration.
        // The downside is that methods that take a Generator cannot accept Cartoon Character.
    }
}
