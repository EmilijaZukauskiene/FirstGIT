package lt.sdacademy.designpatterns.structural.behavioral.strategy.example;

import java.util.ArrayList;
import java.util.Map;

public class Pizza {

    private ArrayList<Ingredient> ingredients;
    private int amount;

    public Pizza() {
        this.amount = 20;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public int calculateTotal() {
        return ingredients.stream()
                .map(ingredient -> ingredient.getPrice())
                .reduce(0,(result,element)->result+element);
    }
   /* public int calculateTotal() { //ekvivalentu
        return ingredients.stream()
                .mapToInt(Ingredient::getPrice)
                .sum();
    }*/

    public void pay(PaymentStrategy paymentStrategy) { //pay metodas kvieciamas su interfeisu
        paymentStrategy.pay(amount + calculateTotal());
    }
}
