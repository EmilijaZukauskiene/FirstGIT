package lt.sdacademy.advanced_features.streams.exercises.exercise4;

import org.apache.log4j.Logger;

public class EquilateralTriangle implements RegularPolygon {

    public int n;

    public EquilateralTriangle(int n) {
        this.n = n;
    }

    public int getPerimeterp() {
        return n * 3;
    }

    public double getInteriorAnglep() {
        return Math.pow(n, 2) * Math.sqrt(3) / 4;    // lygiakrascio trikampio kampo
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return n;
    }
}


/*
Daugiakampiai:
        Interfeisas RegularPolygon turi 2 metodus getNumSides ir getSideLength
        Klasė EquilateralTriangle, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 3, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Klasė Square, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 4, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Interfeise pridėti 2 defaultinius metodus: getPerimeter(n * length) ir getInteriorAngle((n - 2) 180)
        Sukurtoje RegularPolygonMain klasėje apskaičiuoti figūrų perimetrus ir kampa.*/
