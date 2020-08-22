//Exercise 1:(2) Create a simple class. Inside a second class, define a reference to an object of the first class.
// Use lazy initialization to instantiate this object.




public class Runner {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
}
