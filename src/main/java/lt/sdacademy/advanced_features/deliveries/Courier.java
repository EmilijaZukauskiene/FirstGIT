package lt.sdacademy.advanced_features.deliveries;

public class Courier extends Location {

    private String deliveredFrom;
    private String deliveryDate;


    public Courier(String deliveredFrom, String deliveryDate, String name) {
        super(name);
        this.deliveredFrom = deliveredFrom;
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveredFrom() {
        return deliveredFrom;
    }

    @Override
    public String toString() {
        return String.format("Kurjeris: %s, pristatymas is: %s, pristatymo data: %s, name, deliveredFrom, deliveredDate");
    }
}
