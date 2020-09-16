public class Unicycle extends Cycle{
    int wheels = 1;
    @Override
    public int getWheels(){

        return wheels;
    }
    @Override
    public void travel(Cycle c)
    {
        System.out.println("Uni"+ super.name +".ride() " + c.getWheels() + " Wheels");
    }


}
