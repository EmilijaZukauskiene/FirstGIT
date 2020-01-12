package lt.sdacademy.advanced_features.inheritance.animals;

public class Dog extends Animal {
    private String color;

    public Dog (boolean mammal, String voice, String color) {
        super(mammal, voice);
        this.color = color;
    }
}
