package lt.sdacademy.advanced_features.exeptions.custome_exeption;

public class IvykoAritmetineKlaida extends Exception {
    private String message;

    public IvykoAritmetineKlaida(String message){
        this.message = message;
    }
}
