//Exercise 7:   (1) Create a class without a constructor, and then create an object
//of that class in main( ) to verify that the default constructor is automatically synthesized.


public class Runner {
    public static void main(String[] args) {
        TestNoneConstructor test = new TestNoneConstructor();
        test.method();
    }
}
