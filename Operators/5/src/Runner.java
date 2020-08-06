public class Runner {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        spot.says = "Miau";
        scruffy.name = "Scruffy";
        scruffy.says = "A`m angrrrrry";

        System.out.println("I`m dog " + spot.name + " and i say: " + spot.says);
        System.out.println("I`m dog " + scruffy.name + " and i say: " + scruffy.says);

    }
}
