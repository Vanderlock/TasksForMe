//Exercise 6: (2) Create a class that contains int, long, float and double fields. Create a
//toString( ) method for this class that uses String.format( ), and demonstrate that your
//class works correctly


public class Runner {
    public static void main(String[] args) {
        Test test = new Test(15, 4545L, 4.34252345f, 5.4235);
        System.out.println(test);
    }
}
