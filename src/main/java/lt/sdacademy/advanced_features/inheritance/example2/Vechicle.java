package lt.sdacademy.advanced_features.inheritance.example2;

public class Vechicle {
    protected int maxSpeed;

    public Vechicle(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public int getMaxSpeed(){
        return maxSpeed;
    }

    @Override
    public String toString(){
        return "Fields values: maxSpeed=" + maxSpeed;
    }
}
