package lt.sdacademy.advanced_features_coding.advance.exercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonalInformation {

    private static final String FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features_coding/advance/exercise3/PersonalData.txt";

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        readFromFile(personList);

        for (Person person : personList) {
            System.out.println("Vardas: " + person.getName() + ", Pavarde: " + person.getSurname() + ", Telefono Nr." + person.getPhone());
        }
    }

    public static void readFromFile(List<Person> personList) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line;
            line = bufferedReader.readLine();
            while (line != null) {
                personList.add(mapPersonData(line));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Klaida");
        }
    }

    public static Person mapPersonData(String personDataLine) {
        String[] lineforMap = personDataLine.split(",");
        return new Person(lineforMap[0], lineforMap[1], lineforMap[2]);
    }
}

/* Personal information
    Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
        Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
        Enter the created objects into ArrayList or Map ().
        Present the obtained data.*/
