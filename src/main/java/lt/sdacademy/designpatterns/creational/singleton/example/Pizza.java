package lt.sdacademy.designpatterns.creational.singleton.example;

public class Pizza {
    private static Pizza instatnce = null;

    public String name;

    private Pizza() {
        name = "";
    }

    public static Pizza getInstance() {
        if (instatnce == null) {
            instatnce = new Pizza();
        }
        return instatnce;
    }

    @Override
    public String toString() {
        return "Pizza name: " + name;
    }
}
