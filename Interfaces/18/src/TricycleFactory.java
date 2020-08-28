import interfaces.Cycle;
import interfaces.CycleFactory;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
