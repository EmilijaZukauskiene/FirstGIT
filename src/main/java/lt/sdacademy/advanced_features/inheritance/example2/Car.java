package lt.sdacademy.advanced_features.inheritance.example2;

public class Car extends Vechicle {
    private String name;

    public Car (int maxSpeed){
        super(maxSpeed);
    }
    public int getParentHiddenField() {return maxSpeed;}
}
