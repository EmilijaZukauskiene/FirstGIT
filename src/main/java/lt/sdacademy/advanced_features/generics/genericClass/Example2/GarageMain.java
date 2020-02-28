package lt.sdacademy.advanced_features.generics.genericClass.Example2;

public class GarageMain {

    public static void main(String[] args) {

        Car car = new Car();
        Garage<Car> garage = new Garage<>(car);
        garage.repairVehicle();
    }
}
