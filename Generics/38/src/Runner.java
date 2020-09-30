//Exercise 38: (4) Create a simple Decorator system by starting with basic coffee, then
//providing decorators of steamed milk, foam, chocolate, caramel and whipped cream.


public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.printf("Ingredients: %s %nCost: $%.2f", coffee.getIngredients(), coffee.getCost());

        Coffee whippedCreamCoffee = new WhippedCreamCoffee(new SimpleCoffee());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", whippedCreamCoffee.getIngredients(), whippedCreamCoffee.getCost());

        Coffee chocolateCoffee = new ChocolateCoffee(new SimpleCoffee());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", chocolateCoffee.getIngredients(), chocolateCoffee.getCost());

        Coffee foamCoffee = new FoamCoffee(new SimpleCoffee());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", foamCoffee.getIngredients(), foamCoffee.getCost());

        Coffee steamedMilkCoffee = new SteamedMilkCoffee(new SimpleCoffee());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", steamedMilkCoffee.getIngredients(), steamedMilkCoffee.getCost());

        Coffee caramelCoffee = new CaramelCoffee(new SimpleCoffee());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", caramelCoffee.getIngredients(), caramelCoffee.getCost());
    }

}
