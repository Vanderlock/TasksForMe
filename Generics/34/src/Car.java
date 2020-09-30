public class Car extends SelfBoundedType<Car> {
    Car f(Car arg){
        if (arg == null){
            return this;
        }
        return arg;
    }

}
