package lt.sdacademy.advanced_features.optional;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("word!");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        System.out.println(stringOptional1.isPresent()); // patikrina ar tokia reiksme egzistuoja, Optional - objektas

        stringOptional2.ifPresent(System.out::println); // ekvivalentus
        stringOptional2.ifPresent(t-> System.out.println(t)); //ekvivalentus

        String value = stringOptional3.orElse("Hello Word!");
        System.out.println(value);
    }
}
