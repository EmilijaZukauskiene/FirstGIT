package lt.sdacademy.designpatterns.structural.decorator.example;

public class SeafoodPizza extends PizzaDecorator {

    public SeafoodPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("Seafood");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
    }
}
