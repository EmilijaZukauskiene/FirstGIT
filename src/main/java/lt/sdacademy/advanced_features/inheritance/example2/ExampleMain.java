package lt.sdacademy.advanced_features.inheritance.example2;

public class ExampleMain {
    public static void main(String[] args) {
        Car myCar = new Car(130);
        System.out.println(myCar.toString());

        Vechicle myCarVechicle = new Car(210);

        Vechicle vechicle = new Vechicle(85);
        System.out.println(vechicle.toString());
    }
}
