package lt.sdacademy.advanced_features.abstract_examples.shape;

public class RightAngleRectangle extends Shape {
    public double getWidth;
    double width;
    double height;


    public RightAngleRectangle(double width, double height, String shapeDescription) {

        super(shapeDescription);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
