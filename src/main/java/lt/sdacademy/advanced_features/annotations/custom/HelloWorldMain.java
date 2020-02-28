package lt.sdacademy.advanced_features.annotations.custom;

public class HelloWorldMain {

    @MyAnnotation(name = "Emilija", age = 100)
    public void sayHello() {
        System.out.println("Hello World");
    }
}
