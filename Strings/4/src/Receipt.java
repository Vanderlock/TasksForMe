import java.util.Formatter;

public class Receipt {
    double total;
    Formatter f = new Formatter(System.out);
    final int ITEM_WIDTH = 15;
    final int QTY_WIDTH = 5;
    final int PRICE_WIDTH = 10;
    final String PARAMS1 = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
    final String PARAMS2 = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
    final String PARAMS3 = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";


    public void printTitle() {
        f.format(PARAMS1, "Item", "Qty", "Prise");
        f.format(PARAMS1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(PARAMS2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(PARAMS3, "Tax", "", total * 0.06);
        f.format(PARAMS1, "", "", "-----");
        f.format(PARAMS3, "Total", "", total * 1.06);
    }
}
