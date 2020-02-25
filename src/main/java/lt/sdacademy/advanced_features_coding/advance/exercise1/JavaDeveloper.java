package lt.sdacademy.advanced_features_coding.advance.exercise1;

public class JavaDeveloper extends Developer  {

    public JavaDeveloper(String name, int age) {
        super(name, age);

        this.age = age;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
