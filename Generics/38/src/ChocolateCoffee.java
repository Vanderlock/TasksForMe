public class ChocolateCoffee extends CoffeeDecorator {
    public ChocolateCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + chocolate";
    }
}
