package lt.sdacademy.fundamentalscoding.practicalexercises.bookEndAuthors;

public class Author {

    private String name;
    private String email;
    private String phoneNumber;

    public Author(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return String.format("Autoriaus vardas: %s, pastas: %s, name, email");
    }
}

