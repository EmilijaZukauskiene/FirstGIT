package lt.sdacademy.advanced_features.interfaces.example1;

public interface Shape {
    double getArea();

    double getPerimeter();

    default void print420() {
        System.out.println("Shape: " + this);
    }
}
