package lt.sdacademy.designpatterns.creational.builder;


import lt.sdacademy.designpatterns.creational.builder.example.Pizza;

public class Builder {

    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margarita", 50)
                .addCheese(true)
                .addSauce(true)
                .takeAway(true)
                .build();
        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42)
                .addSauce(true)
                .build();
        System.out.println(margharita);
        System.out.println(capriciosa);
    }
}
