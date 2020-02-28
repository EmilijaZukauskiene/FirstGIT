package lt.sdacademy.advanced_features.exeptions.custome_exeption;

public class StringIndexOutOfBoundsExeptionExample {
    public static void main(String[] args) {
        try {
            String a = "This is like chipping";// length is 22
            char c = a.charAt(24); // simbolis 24;
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exeption");
        }
    }
}
