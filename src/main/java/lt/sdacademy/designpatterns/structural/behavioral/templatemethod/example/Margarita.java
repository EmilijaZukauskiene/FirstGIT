package lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example;

public class Margarita extends Pizza {

    @Override
    protected void addInredients() {
        System.out.println("Margarita");
        System.out.println("Add ingredients: Tomato Souse, Chees");
    }
}
