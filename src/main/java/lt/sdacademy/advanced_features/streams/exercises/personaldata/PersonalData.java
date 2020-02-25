package lt.sdacademy.advanced_features.streams.exercises.personaldata;

public class PersonalData {

    private String name;
    private String surname;
    private String phone;


    public PersonalData(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
