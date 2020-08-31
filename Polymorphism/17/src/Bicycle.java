public class Bicycle extends Cycle {
    String name = "Bicycle";
    @Override
    public void balance(){
        System.out.println("Balance bicycle");
    }

    public String toString() {
        return this.name;
    }
}
