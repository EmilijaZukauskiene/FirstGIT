package lt.sdacademy.advanced_features.exeptions.custome_exeption;

public class NullPointerExeptionExample {
    public static void main(String[] args) throws Exception {
        try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerExeption..");
            throw new NullPointerException("Null pointer happend"); //informacija apie klaida pranesam aukstesniai klasei
        }
    }
}
