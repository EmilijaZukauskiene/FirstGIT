package lt.sdacademy.advanced_features.generics.genericClass.Example1;

public class Car {
    public static void main(String[] args) {

        Car car = new Car();

        GenericBox<Car> boxWithCArIntIt = new GenericBox<>(car);
    }
}
