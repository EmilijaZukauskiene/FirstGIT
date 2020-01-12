package lt.sdacademy.advanced_features.collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Example {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>(); //SET'as netalpina dublikatu!!!!!!
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");

        for (String country : travelRoute) {
            System.out.println(country + " ");
        }
    }
}

