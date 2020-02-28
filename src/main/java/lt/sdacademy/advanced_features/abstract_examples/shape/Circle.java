package lt.sdacademy.advanced_features.abstract_examples.shape;

public class Circle extends Shape {

    private int radius;


    public Circle(int radius, String shapeDescription) {
        super(shapeDescription);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

}