package lt.sdacademy.designpatterns.structural.behavioral.strategy.example;

public class CreditCard implements PaymentStrategy {

    private String fullName;
    private String cardName;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String fullName, String cardName, String cvv, String dateOfExpiry) {
        this.fullName = fullName;
        this.cardName = cardName;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount+ "$, paid with credit card" );

    }
}
