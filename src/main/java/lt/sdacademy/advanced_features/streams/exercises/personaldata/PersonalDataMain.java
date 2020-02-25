package lt.sdacademy.advanced_features.streams.exercises.personaldata;

import com.google.gson.Gson;
import lt.sdacademy.advanced_features.json.toJson.Staff;
import lt.sdacademy.advanced_features.lambdaexpresion.example2.Person;
import sun.security.pkcs10.PKCS10;

import java.io.FileReader;
import java.io.IOException;

public class PersonalDataMain {

    private static final String INPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/streams/exercises/personaldata/PersonalData.json";

    public static void main(String[] args) {
        Person person = readFile();
        person.print();
    }

    private static Person readFile() {
        Gson gson = new Gson();
        Person person = null;

        try (FileReader reader = new FileReader(INPUT_FILE_LOCATION)) {
            gson.fromJson(reader, PersonalData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
}

// TODO

   /* Asmeniniai duomenys:
        Susikurti objektą PersonalData su laukais: name, surname, phone;
        Duomenys turi būti skaitomi iš failo (Json) formatu;
        Duomenys turi būti nuskaityti į ArrayList strukturu;
        Atsvaizduoti nuskaitytus duomenis ekrane.*/

  /* Personal information
    Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
        Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
        Enter the created objects into ArrayList or Map ().
        Present the obtained data.*/
