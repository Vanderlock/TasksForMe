//Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of
//constant values. The goal is to allow you to easily change a width by changing a single value
//in one place.


public class Runner {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.print("Alivaria 10",1, 3.29);
        receipt.printTotal();

    }
}
