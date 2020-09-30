public class FoamCoffee extends CoffeeDecorator {
    public FoamCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + foam";
    }
}
