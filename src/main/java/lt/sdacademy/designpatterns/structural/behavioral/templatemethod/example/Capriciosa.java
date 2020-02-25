package lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example;

public class Capriciosa extends Pizza {
    @Override
    protected void addInredients() {
        System.out.println("Capriciosa");
        System.out.println("Add ingredients: Tpmato Sause, Chees, Hams, Mushrooms");

    }
}
