package lt.sdacademy.advanced_features.deliveries;

public class Gadget {

    private  GadgetType gadgetType;
    private double price;
    private String courier;

    public Gadget(GadgetType gadgetType, double price, String courier) {
        this.gadgetType = gadgetType;
        this.price=price;
        this.courier=courier;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public double getPrice() {
        return price;
    }

    public String getCourier() {
        return courier;
    }

    @Override
    public String toString() {
        return String.format("Iranga: %s, kaina: %s, kurjeris: %s, gadgetType, price, courier");
    }
}
