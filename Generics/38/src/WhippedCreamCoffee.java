public class WhippedCreamCoffee extends CoffeeDecorator {
    public WhippedCreamCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.7;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + whipped cream";
    }
}
