
//Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
//of which are of a different parameterized type.
//Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is non-parameterized.


public class Runner {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        System.out.println("Book example");
        gm.bookMethod(1234.2);
        GenericMethods gm1 = new GenericMethods();
        System.out.println("Ex 9");
        gm1.ex9Method(123.21,12,true);
        GenericMethods gm2 = new GenericMethods();
        System.out.println("Ex 10");
        try {
            gm2.ex10Method(12.2F,'x',"Hello");
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Exception. Last item must be String type!");
        }

    }
}
