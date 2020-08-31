import interfaces.Cycle;
import interfaces.CycleFactory;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
