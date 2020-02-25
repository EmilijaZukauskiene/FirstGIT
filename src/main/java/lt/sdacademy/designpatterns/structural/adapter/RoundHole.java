package lt.sdacademy.designpatterns.structural.adapter;

public class RoundHole {
    private double radius;


    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) { // SquarePegAdapter paveldi RoundPeg, todel vietoj jo galima rasyti RoundPeg
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
