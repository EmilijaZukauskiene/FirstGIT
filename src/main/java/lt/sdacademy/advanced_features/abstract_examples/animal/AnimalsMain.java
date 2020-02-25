package lt.sdacademy.advanced_features.abstract_examples.animal;

import lt.sdacademy.advanced_features.inheritance.animals.Animal;
import lt.sdacademy.advanced_features.inheritance.animals.Cat;
import lt.sdacademy.advanced_features.inheritance.animals.Dog;

import java.util.Arrays;
import java.util.List;

public class AnimalsMain {

    public static void main(String[] args) {
        List<lt.sdacademy.advanced_features.inheritance.animals.Animal> animals = Arrays.asList(
                new Cat(true, "miau", "white"),
                new Dog(true, "au", "black"),
                new Cat(true, "miau", "brown")
        );
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.yieldVoice());
        }
    }
}

