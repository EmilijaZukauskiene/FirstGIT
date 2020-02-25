package lt.sdacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Margaritta;
import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class MArgaritaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Margaritta(size);
    }
}
