package lt.sdacademy.advanced_features.streams.exercises.exercise4;

import com.google.gson.internal.bind.util.ISO8601Utils;

public interface RegularPolygon {

    int getNumSides();
    int getSideLength();

    default int getPerimeter() {
        return (getNumSides() * getSideLength());
    }

    default double getInteriorAngle() {
        return (getNumSides() - 2) * 180;
    }
}