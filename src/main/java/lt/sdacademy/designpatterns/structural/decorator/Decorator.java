package lt.sdacademy.designpatterns.structural.decorator;

import lt.sdacademy.designpatterns.structural.decorator.example.*;

public class Decorator {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();

        Pizza hamPizza = new HamPizza(pizza);
        pizza.printIngredients();

        Pizza mushroomsPizza = new MushroomsPizza(pizza);
        pizza.printIngredients();

        Pizza seafoodPizza = new SeafoodPizza(pizza);
        pizza.printIngredients();

    }
}
