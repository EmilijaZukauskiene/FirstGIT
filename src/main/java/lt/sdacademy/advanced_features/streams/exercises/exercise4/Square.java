package lt.sdacademy.advanced_features.streams.exercises.exercise4;

public class Square implements RegularPolygon{

  private int n;

    public Square(int n) {
        this.n = n;
    }


    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return n;
    }
}
