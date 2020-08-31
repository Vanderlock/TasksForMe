public class Tricycle extends Cycle{
    String name = "Tricycle";
    int wheels = 3;
    @Override
    public int getWheels(){
        return wheels;
    }
    @Override
    public void travel(Cycle c) {
        System.out.println("Tricycle.ride() " + c.getWheels() + " Wheels");
    }
    public String toString() {
        return this.name;
    }
}
