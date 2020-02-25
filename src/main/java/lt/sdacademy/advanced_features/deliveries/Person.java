package lt.sdacademy.advanced_features.deliveries;

public class Person extends Location {

    private String deliveryAddress;
    private GadgetType gadgetType;
    private int deliverUntil;

    public Person(String splitedLineDatum, String name, String deliveryAddress) {
        super(name);
        this.gadgetType = gadgetType;
        this.deliverUntil = deliverUntil;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public int getDeliverUntil() {
        return deliverUntil;
    }
}
