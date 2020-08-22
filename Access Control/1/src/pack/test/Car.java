package pack.test;

public class Car {
    private int speed;
    private String colour;

    public Car() {
    }

    public Car(int speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
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
