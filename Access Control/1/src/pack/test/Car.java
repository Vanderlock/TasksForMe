package pack.test;

public class Car {
    private int speed;
    private String colour;

    public Car(int speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
