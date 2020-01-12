package lt.sdacademy.fundamentalscoding.practicalexercises.worker;

public class Worker {
    private String name;
    private double salary;
    private Integer age;
    private char gender;

    public Worker(String name, double salary,  Integer age, char gender ) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
