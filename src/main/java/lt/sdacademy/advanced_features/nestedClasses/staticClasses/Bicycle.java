package lt.sdacademy.advanced_features.nestedClasses.staticClasses;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Mechanic {               //static klases nezino apie viena kita
        public void repair(Bicycle bicycle) {
            bicycle.maxSpeed += 15;
        }
    }
}
