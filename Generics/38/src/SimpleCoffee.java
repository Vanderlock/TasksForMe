public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 2.3;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
