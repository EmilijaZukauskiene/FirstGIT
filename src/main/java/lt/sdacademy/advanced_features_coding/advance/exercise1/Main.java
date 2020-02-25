package lt.sdacademy.advanced_features_coding.advance.exercise1;

public class Main {
    public static void main(String[] args) {

        JavaDeveloper javaDeveloper1 = new JavaDeveloper("Petras", 35);

        System.out.println(javaDeveloper1.toString());

    }
}

/*Create 3 classes: Person, Developer, JavaDeveloper.
        Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from Developer
        Create constructor for every class that will call constructor of the super class. Each constructor should display an information, that it has been called.
        Create an object of type JavaDeveloper.
        Using an object of type JavaDeveloper call a method that is defined in Developer class. What access modifier should it have?
        *Overload method from the Person class in JavaDeveloper class to accept additional parameters.*/