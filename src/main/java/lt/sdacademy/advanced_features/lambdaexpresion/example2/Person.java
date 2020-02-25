package lt.sdacademy.advanced_features.lambdaexpresion.example2;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String getSurname() {
        return surname;
    }

    public void print() {
    }
}
