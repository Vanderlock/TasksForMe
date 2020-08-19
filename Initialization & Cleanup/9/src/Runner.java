//Exercise 9:
// (1) Create a class with two (overloaded) constructors.
// Using this, call the second constructor inside the first one.


public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("Starlet");
        Car car2 = new Car(300,140);
        System.out.println("Car1 model: " + car1.getModel() +
                        "\nCar1 speed: " + car1.getSpeed() +
                        "\nCar1 power: " + car1.getPower());
        System.out.println("Car2 model: " + car2.getModel() +
                "\nCar2 speed: " + car2.getSpeed() +
                "\nCar2 power: " + car2.getPower());

    }
}
