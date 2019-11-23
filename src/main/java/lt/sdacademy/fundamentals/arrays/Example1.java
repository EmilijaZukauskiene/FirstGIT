package lt.sdacademy.fundamentals.arrays;

public class Example1 {
    public static void main(String[] args) {

        int[] array0fInts = new int[5]; // [] nurodo, kad tai yra masyvas, [5] nurodo, kokio dydzio yra masyvas
        //inicializavimas
        array0fInts[0] = 10;
        array0fInts[1] = 15;
        array0fInts[2] = 20;
        array0fInts[3] = 25;
        array0fInts[4] = 30;

        for (int value : array0fInts) {
            System.out.println(value);
        }
        for (int i = 0; i < array0fInts.length + 1; i++) {
            //try {
            System.out.println(array0fInts[i]);
            /*   } catch (Exception e) {
            //      System.out.println("KLAIDA"); /*Naudojama,kad programa nenuluztu ir neismestu error*/
        }
    }
}