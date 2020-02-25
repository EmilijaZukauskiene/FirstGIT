package lt.sdacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {

    Pizza create(int size);
}

