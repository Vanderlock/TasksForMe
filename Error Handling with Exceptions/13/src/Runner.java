//Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally
//clause is executed, even if a NullPointerException is thrown.



public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        try {
            cat = null;
            cat.say("I`m dead cat");

        } catch (ExAll exception){
            System.err.println(exception);
            exception.printStackTrace(System.out);
        }finally {
            System.out.println("All right. Finally work");
        }




    }
}
