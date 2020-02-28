package lt.sdacademy.advanced_features.deliveries;

public abstract class Location {

    protected String name; //mato tik paveldincios klases tiesiogiai ir nereikia geteriu
    protected String address;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Location(String name) {
    }
}
