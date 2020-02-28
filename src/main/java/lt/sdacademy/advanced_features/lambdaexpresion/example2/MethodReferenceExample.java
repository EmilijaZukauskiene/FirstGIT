package lt.sdacademy.advanced_features.lambdaexpresion.example2;

import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter", 12);

        Predicate<Person> adultPersonTest = Person::isAdult; // ekvivalencios funkcijos
        Predicate<Person> adultPersonTest1 = person1 -> person1.isAdult(); //ekvivalencios funkcijos

        adultPersonTest.test(person);
        System.out.println(adultPersonTest1.test(person));
    }
}
