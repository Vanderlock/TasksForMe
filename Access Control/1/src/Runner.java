//Exercise 1:   (1) Create a class in a package.
// Create an instance of your class outside of that package.


import pack.test.Car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(100,"red");
        pack.test.Car car2 = new pack.test.Car(70,"green");//if i don`t use import
        System.out.println(car.toString());
        System.out.println(car2.toString());
    }
}
