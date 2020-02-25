package lt.sdacademy.designpatterns.structural.behavioral.templatemethod;

import lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example.Capriciosa;
import lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example.Margarita;
import lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example.Pizza;

public class TemplateMethod {

    public static void main(String[] args) {
        Pizza margarita = new Margarita();
        Pizza capriciosa = new Capriciosa();
        margarita.bakingPizza();
        System.out.println("----------");
        capriciosa.bakingPizza();
    }
}
