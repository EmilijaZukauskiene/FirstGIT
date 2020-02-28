package lt.sdacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.FruttiDiMare;
import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class PizzaFactory {

    public static Pizza createPizza(String type, int size) {
        Pizza pizza;
        switch (type) {
            case "Margarita":
                pizza = new MArgaritaFactory().create(size);
                break;
            case "Capriciosa":
                pizza = new CapriciosaFactory().create(size);
                break;
      /*      case "FruttiDiMare":
                pizza=new FruttiDiMare().
   */         default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
