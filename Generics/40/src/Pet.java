public class Pet extends Individual {
    Pet(String name) {
        super(name);
    }

    Pet() {
        super();
    }

    public void speak() {
        System.out.println(this + " speak");
    }
}
