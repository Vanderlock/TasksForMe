//Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
//throws all three. In main( ), call the method but only use a single catch clause that will
//catch all three types of exceptions



public class Runner {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat = null;
        try {
            Cat cat = new Cat();
            cat.say("rrr");
        } catch (Ex1 | Ex2 | Ex3 exception){
            System.err.println(exception);
            exception.printStackTrace(System.out);
        }


    }
}
