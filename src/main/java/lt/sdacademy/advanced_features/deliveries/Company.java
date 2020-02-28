package lt.sdacademy.advanced_features.deliveries;

public class Company extends Location {

    private Gadget gadget;

    public Company(String name, String address, Gadget gadget) {
        super(name, address);
        this.gadget = gadget;
    }

    @Override
    public String toString() {
        return String.format("Kompanija: %s, adresas: %s, iranga: , name, address, gadget");
    }
}
