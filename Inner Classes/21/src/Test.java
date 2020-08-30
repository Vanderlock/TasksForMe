import Interfaces.Interface;

public class Test implements Interface {
    @Override
    public String f() {
        return "Hello";
    }

    @Override
    public String g() {
        return "World";
    }
}
