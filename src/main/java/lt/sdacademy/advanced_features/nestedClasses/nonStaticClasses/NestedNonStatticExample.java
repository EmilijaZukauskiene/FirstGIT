package lt.sdacademy.advanced_features.nestedClasses.nonStaticClasses;

public class NestedNonStatticExample {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(24);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();
        System.out.println(bicycle.getMaxSpeed());
    }
}
