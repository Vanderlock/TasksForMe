public class StormyInning extends Inning implements Storm{
    StormyInning() {
        System.out.println("Created StormyInning");
    }
    StormyInning(String s) {

    }
    @Override
    void walk(){
        //
        System.out.println("walk");
    }
    @Override
    public void event(){
        //
        System.out.println("event");
    }
    @Override
    public void rainHard() {

    }
    @Override
    void atBat() {
        System.out.println("atBat");
    }
}
