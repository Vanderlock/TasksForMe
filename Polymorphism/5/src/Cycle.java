public class Cycle {
    String name = "cycle";
    int wheels = 0;

    public void ride() {
        travel(this);
        //System.out.println("wheels: " + c.getWheels());
    }
    public void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c.getWheels() + " Wheels");
    }
    public int getWheels(){
        return wheels;
    }


}
