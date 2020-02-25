package lt.sdacademy.designpatterns.creational.abstractfactory;

import lt.sdacademy.designpatterns.creational.abstractfactory.example.factories.PizzaFactory;
import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class AbstractFactory {

    public static void main(String[] args) {
        Pizza margarita = PizzaFactory.createPizza("Margarita", 32);
        Pizza capriciosa=PizzaFactory.createPizza("Capriciosa", 42);

        System.out.println(margarita);
        System.out.println(capriciosa);
    }
}