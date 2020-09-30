public class CaramelCoffee extends CoffeeDecorator {
    public CaramelCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + caramel";
    }
}
