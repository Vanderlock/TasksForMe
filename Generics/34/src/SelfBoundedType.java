abstract class SelfBoundedType<T extends SelfBoundedType<T>> {
    abstract T f(T arg);
    T test(){
        return  f(null);
        }
}
