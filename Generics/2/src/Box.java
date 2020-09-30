public class Box <T> {
    T apple, deodorant, watch;

    public Box(T apple, T deodorant, T watch) {
        this.apple = apple;
        this.deodorant = deodorant;
        this.watch = watch;
    }

    public T getApple() {
        return apple;
    }

    public void setApple(T apple) {
        this.apple = apple;
    }

    public T getDeodorant() {
        return deodorant;
    }

    public void setDeodorant(T deodorant) {
        this.deodorant = deodorant;
    }

    public T getWatch() {
        return watch;
    }

    public void setWatch(T watch) {
        this.watch = watch;
    }
}
