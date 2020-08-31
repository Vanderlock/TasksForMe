public class Cycle {
    String name = "Cycle";
    int wheels = 0;

    public void ride(Cycle c) {
        c.travel(c);
        //System.out.println("wheels: " + c.getWheels());
    }
    public void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c.getWheels() + " Wheels");
    }
    public int getWheels(){
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}
