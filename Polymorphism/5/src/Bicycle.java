public class Bicycle extends Cycle {

    int wheels = 2;
    @Override
    public int getWheels(){
        return wheels;
    }
    @Override
    public void travel(Cycle c) {
        System.out.println("Bi"+ super.name +".ride() " + c.getWheels() + " Wheels");
    }

}
