package lt.sdacademy.advanced_features_coding.advance.exercise1;

public class Developer extends Person{

    protected int age;

    public Developer(String name, int age) {
        super(name, age);
        System.out.println("The best developer!");
    }
}
