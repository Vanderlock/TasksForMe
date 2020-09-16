public class Cycle {
    String name = "cycle";

    public void ride() {
        travel(this);
    }


    public void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }




    public String toString() {
        return this.name;
    }
}
