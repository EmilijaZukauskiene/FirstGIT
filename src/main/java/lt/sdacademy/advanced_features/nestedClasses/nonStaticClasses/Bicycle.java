package lt.sdacademy.advanced_features.nestedClasses.nonStaticClasses;

public class Bicycle {
    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

        public class Wheel {       // nestatine klase - butina susikurti isorine klase
        public void damage() {
            maxSpeed *= 0.5;
        }
    }
}