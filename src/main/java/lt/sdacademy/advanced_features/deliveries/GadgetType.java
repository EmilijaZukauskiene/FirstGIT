package lt.sdacademy.advanced_features.deliveries;

import java.util.HashMap;
import java.util.Map;

public enum GadgetType {

    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER ("kompiuteris"),
    MICRO_CONTROLER("mikro kontroleris");

    private final String name;
    private static final Map<String, GadgetType>enumByGadgetType = new HashMap<>();
    static {
        for (GadgetType enumValue : values()){
            enumByGadgetType.put(enumValue.name, enumValue);
        }
    }

    GadgetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
