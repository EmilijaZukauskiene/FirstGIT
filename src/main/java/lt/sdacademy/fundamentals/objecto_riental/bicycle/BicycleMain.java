package lt.sdacademy.fundamentals.objecto_riental.bicycle;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(75, 2, 20); // vienoda tvarka ir inicializuojam (pagal private)

        bike.getModel(); // grazinama 75
        System.out.println(bike.getModel()); // isvesta i ekrana 75

        int model = bike.getModel();
        System.out.println("Model is " + model);
        System.out.println(Bicycle.count); //isvesta i ekrana 1 (count++)

        Bicycle anotherBike = new Bicycle(80, 4, 25);
        System.out.println(Bicycle.count); //isvesta i ekrana 2 (count++)

        //abiejuose atvejuose isvedama reiksme true
        System.out.println(Bicycle.count == bike.count);
        System.out.println(bike.count == anotherBike.count);
    }
}