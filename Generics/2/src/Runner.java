//Exercise 2: (1) Create a holder class that holds three objects of the same type, along with
//the methods to store and fetch those objects and a constructor to initialize all three.



public class Runner {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Fresh - apple","OldSpice", "Apple Watch");
        System.out.println(box.getApple() + " || " + box.getDeodorant() + " || " + box.getWatch());
        box.setApple("Apple core");
        box.setDeodorant("Nivea");
        box.setWatch("Casio");
        System.out.println("Changed values");
        System.out.println(box.getApple() + " || " + box.getDeodorant() + " || " + box.getWatch());

    }
}
