public class Car {
    private int speed;
    private int power;
    private String model;

    public Car(String model) {
        this(140,72);
        this.model = model;
    }

    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }


}
