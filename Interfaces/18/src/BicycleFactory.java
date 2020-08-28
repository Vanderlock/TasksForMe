import interfaces.Cycle;
import interfaces.CycleFactory;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
