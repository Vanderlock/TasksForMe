public class SteamedMilkCoffee extends CoffeeDecorator {
    public SteamedMilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + Steamed Milk";
    }
}
