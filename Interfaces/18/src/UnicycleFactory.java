import interfaces.Cycle;
import interfaces.CycleFactory;

public class UnicycleFactory implements CycleFactory {

    public Cycle getCycle() {
        return new Unicycle();
    }
}
