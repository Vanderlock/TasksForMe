public class Unicycle extends Cycle{
    String name = "Unicycle";
    int wheels = 1;
    @Override
    public int getWheels(){

        return wheels;
    }
    @Override
    public void travel(Cycle c)
    {
        System.out.println("Unicycle.ride() " + c.getWheels() + " Wheels");
    }

    public String toString() {

        return this.name;
    }
}
