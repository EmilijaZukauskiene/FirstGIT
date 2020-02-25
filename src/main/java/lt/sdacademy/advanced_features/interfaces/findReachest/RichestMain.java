package lt.sdacademy.advanced_features.interfaces.findReachest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RichestMain {

    public static void main(String[] args) {

        List<World> objList = Arrays.asList(
                new Country("Mozambikas", BigDecimal.valueOf(1000)),
                new Country("Lietuva", BigDecimal.valueOf(1000000)),
                new Country("Estija", BigDecimal.valueOf(100)),
                new Person("Saulius", BigDecimal.valueOf(12)),
                new Person("Paulius", BigDecimal.valueOf(4500))
        );

        World richest = objList.get(0);


        for (int i = 0; i<objList.size() - 1; i++){
            if (richest.findRicher(objList.get(i + 1).amount)) {
                richest = objList.get(i + 1);
            }
        }
        // System.out.format("Richest name is: $s with amount: $f", name, amount);
        System.out.println("Richest is: " + richest.name + " with amount " + richest.amount);
    }
}
