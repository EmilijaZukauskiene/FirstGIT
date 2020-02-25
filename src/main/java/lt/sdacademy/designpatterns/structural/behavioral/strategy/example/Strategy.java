package lt.sdacademy.designpatterns.structural.behavioral.strategy.example;

import java.util.List;

public class Strategy {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Ingredient ingredient1 = new Ingredient("Cheese", 15);
        Ingredient ingredient2 = new Ingredient("Ham", 20);
        Ingredient ingredient3 = new Ingredient("Mushrooms", 10);

        pizza.addIngredient(ingredient1);
        pizza.addIngredient(ingredient2);
        pizza.addIngredient(ingredient3);

        pizza.pay(new Cash());

        pizza.pay(new CreditCard("David Wilson", "4465468764646", "324", "02/2025"));
    }
}
