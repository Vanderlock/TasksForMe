//(1) Modify all the exception types in StormyInning.java so that they
//extend RuntimeException, and show that no exception specifications or try blocks are
//necessary. Remove the ‘//!’ comments and show how the methods can be compiled without
//specifications.




public class Runner {
    public static void main(String[] args) {
        StormyInning stormyInning = new StormyInning();
        stormyInning.walk();
        stormyInning.event();
        stormyInning.atBat();




    }
}
