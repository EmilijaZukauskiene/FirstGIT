package lt.sdacademy.fundamentals.enumerators;

import java.util.HashMap;
import java.util.Map;

public enum EnumClassExample3 {
    AUDI ("audi",true),
    VW ("volkswagen",false),
    TOTYOTA("toyota", true),
    BMW ("beemer", false);

    private final String carName;
    private final boolean runAndDrive;
    private static final Map<String, EnumClassExample3> enumByCarName = new HashMap<>(); // STRING - KEY

    static {
        for (EnumClassExample3 enumValue : values()) {
            enumByCarName.put(enumValue.carName, enumValue); // Value - visa eilute grazina,
        }
    }
    EnumClassExample3 (String carName, boolean runAndDrive){
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }
    public static EnumClassExample3 getEnumByCarName(String carName) {
        return enumByCarName.get(carName);
    }
    public boolean isRunAndDrive(){
        return runAndDrive;
    }
}
