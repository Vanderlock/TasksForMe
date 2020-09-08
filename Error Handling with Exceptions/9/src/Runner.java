//Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
//throws all three. In main( ), call the method but only use a single catch clause that will
//catch all three types of exceptions



public class Runner {
    public static void main(String[] args) {

        try {

            Cat cat2 = new Cat();
            cat2.say("hello");


        } catch (ExAll exception){
            System.err.println(exception);
            exception.printStackTrace(System.out);
        }


    }
}
