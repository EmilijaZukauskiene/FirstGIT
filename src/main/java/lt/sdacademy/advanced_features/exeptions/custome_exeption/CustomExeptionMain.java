package lt.sdacademy.advanced_features.exeptions.custome_exeption;

public class CustomExeptionMain {
    private static final String TEXT = "tekstas"; // tikrina sita teksta

    public static void main(String[] args) {
        try {
            if (!TEXT.equals("tekstas1")){
                throw  new CustomExeption("Bad text found");
            }
        }catch (CustomExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
