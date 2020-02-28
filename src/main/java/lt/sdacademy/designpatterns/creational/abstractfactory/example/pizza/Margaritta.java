package lt.sdacademy.designpatterns.creational.abstractfactory.example.pizza;

public class Margaritta extends Pizza {

    private final int size;

    public Margaritta(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "Margarita";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngredients() {
        return "Chees, Tomato Sause";
    }
}
