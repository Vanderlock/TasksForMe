public class Tricycle extends Cycle{

    int wheels = 3;
    @Override
    public int getWheels(){
        return wheels;
    }
    @Override
    public void travel(Cycle c) {
        System.out.println("Tri"+ super.name +".ride() " + c.getWheels() + " Wheels");
    }

}
