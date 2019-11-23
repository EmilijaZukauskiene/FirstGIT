package lt.sdacademy.fundamentalscoding.practicalexercises.worker;

public class Worker {
    private String name;
    private Integer salary;
    private Integer age;
    private String gender;

    public Worker(String name, Integer salary,  Integer age, String gender ) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
