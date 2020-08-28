//Exercise 18:   (2) Create a interfaces.Cycle interface, with implementations Unicycle,
// Bicycle and Tricycle. Create factories for each type of interfaces.Cycle,
// and code that uses these factories.


import interfaces.Cycle;
import interfaces.CycleFactory;

public class Runner {
    public static void rideCycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
