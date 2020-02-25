package lt.sdacademy.designpatterns.creational.factorymethod;

import lt.sdacademy.designpatterns.creational.factorymethod.example.Pizza;
import lt.sdacademy.designpatterns.creational.factorymethod.example.PizzaFactory;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza margarita = factory.getPizza(1); //klase sukuriam is Interfeiso
        Pizza capriciosa = factory.getPizza(2);
        Pizza fruttidimare = factory.getPizza(3);

        System.out.println(margarita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());
        System.out.println(fruttidimare.getDetectedPizza());
    }
}
