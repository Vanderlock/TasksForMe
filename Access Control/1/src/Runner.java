//Exercise 1:   (1) Create a class in a package.
// Create an instance of your class outside of that package.


import pack.test.Car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(100,"red");
        pack.test.Car car2 = new pack.test.Car(70,"green");//if i don`t use import

        Car car3 = new Car();
        car3.setSpeed(250);           // with use setters
        car3.setColour("black");

        System.out.println(car.toString());
        System.out.println(car2.toString());

        // sout with getters
        System.out.println("Car{" +
                "speed=" + car3.getSpeed() +
                ", colour='" + car3.getColour() + '\'' +
                '}');
    }
}
