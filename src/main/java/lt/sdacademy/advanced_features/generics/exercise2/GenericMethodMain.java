package lt.sdacademy.advanced_features.generics.exercise2;

import java.util.List;

public class GenericMethodMain<T> {

    public static <T> T lastEntry(List<T> list) {
        return list.get(list.size() - 1);
    }
}
