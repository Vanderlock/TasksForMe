public class Bicycle extends Cycle {
    String name = "Bicycle";
    int wheels = 2;
    @Override
    public int getWheels(){
        return wheels;
    }
    @Override
    public void travel(Cycle c) {
        System.out.println("Bicycle.ride() " + c.getWheels() + " Wheels");
    }
    public String toString() {
        return this.name;
    }
}
