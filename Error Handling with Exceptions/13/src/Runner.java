//Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally
//clause is executed, even if a NullPointerException is thrown.



public class Runner {
    public static void main(String[] args) {

        try {
            Cat cat = new Cat();
            //cat.say("HeLlO");
            Cat cat2 = new Cat();
            cat2 = null;
            cat2.say("i`m dead cat");
        } catch (Ex1 | Ex2 | Ex3 exception){
            System.err.println(exception);
            exception.printStackTrace(System.out);
        }finally {
            System.out.println("All right. Finally work");


        }


    }
}
