package lt.sdacademy.advanced_features_coding.advance.exercise4.model;

public class Person {
    private String name;
    private String bornDate;

    public Person(String name, String bornDate) {
        this.name = name;
        this.bornDate = bornDate;
    }

    public String getbName() {
        return name;
    }

    public String getBornDate() {
        return bornDate;
    }
}
