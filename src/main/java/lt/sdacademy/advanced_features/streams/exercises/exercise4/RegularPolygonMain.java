package lt.sdacademy.advanced_features.streams.exercises.exercise4;

import org.apache.log4j.Logger;

public class RegularPolygonMain {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(RegularPolygonMain.class);

    public static void main(String[] args) {

            Square square = new Square(2);

            System.out.println("perimeter_square - " + square.getPerimeter());

            EquilateralTriangle triangle = new EquilateralTriangle(4);

            System.out.println("perimeter_triangle - " + triangle.getPerimeter());
            System.out.println("Interior angle square- " + square.getInteriorAngle());
            System.out.println("Interiorangle triangle - " + triangle.getInteriorAngle());
        }
    }
/*
Daugiakampiai:
        Interfeisas RegularPolygon turi 2 metodus getNumSides ir getSideLength
        Klasė EquilateralTriangle, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 3, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Klasė Square, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 4, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Interfeise pridėti 2 defaultinius metodus: getPerimeter(n * length) ir getInteriorAngle((n - 2) 180)
        Sukurtoje RegularPolygonMain klasėje apskaičiuoti figūrų perimetrus ir krastines.*/
