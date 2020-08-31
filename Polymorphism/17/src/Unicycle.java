public class Unicycle extends Cycle{
    String name = "Unicycle";
    @Override
    public void balance(){
        System.out.println("Balance unicycle");
    }

    public String toString() {
        return this.name;
    }
}
