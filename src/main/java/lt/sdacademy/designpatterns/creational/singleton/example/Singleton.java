package lt.sdacademy.designpatterns.creational.singleton.example;

public class Singleton {

    public static void main(String[] args) {
        Pizza margarita = Pizza.getInstance(); // tas pats objektas - Pizza
        margarita.name = "Margarita";

        Pizza capriciosa = Pizza.getInstance();
        capriciosa.name = "Capriciosa";

        Pizza frutidimare = Pizza.getInstance();
        frutidimare.name = "Fruti di mare";

        System.out.println(margarita);
        System.out.println(capriciosa);
        System.out.println(frutidimare);
    }
}
