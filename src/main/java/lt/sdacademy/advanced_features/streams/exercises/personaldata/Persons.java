package lt.sdacademy.advanced_features.streams.exercises.personaldata;

import lt.sdacademy.advanced_features.lambdaexpresion.example2.Person;
import sun.security.util.math.intpoly.P384OrderField;

import java.util.List;

public class Persons {
    private List<PersonalData> persons;


    public Persons(List<PersonalData> persons) {
        this.persons = persons;
    }

    public void print() {
        for (PersonalData personalData : persons) {
            System.out.println(personalData.toString());
        }
    }
}
