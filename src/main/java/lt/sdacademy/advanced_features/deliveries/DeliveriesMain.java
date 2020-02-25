package lt.sdacademy.advanced_features.deliveries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeliveriesMain {
    private static final String INPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/deliveries/Data.txt";
    private static final String OUTPUT_FILE_lOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/deliveries/Deliveries.txt";

    public static void main(String[] args) {

        List<Company> companies = getMostExpenciveGadgetFromFile();

    }

    private static List<Company> getMostExpenciveGadgetFromFile() {
        List<Company> companies = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_LOCATION));
            String line = bufferedReader.readLine();

            while (line != null) {
     //           companies.add(mapDatatoModel(line));
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Klaida");
        } catch (IOException e) {
            System.out.println("Klaida!");
        }
        return companies;
    }


    private static void mapDatatoModel(String lineData) {
        String[] splitedData = lineData.split(",");
        return;
    }
}

// TODO
/*Deliveries:
 * Susikurti 5 objektus: `Company`, `Gadget`, `GadgetType`, `Distributor`, `Person`
 * Privaloma naudoti abstrakčias klases;
 * Person turi talpinti laukus (`name`, `deliveryAddress`, `gadgetType`, `deliverUntil`);
 * Company turi talpinti laukus (`name`, `companyAddress`, `gadget`);
 * Gadget turi talpinti (`gadgetType`, `price`, `distributor`);
 * Distributor turi talpinti (`name`, `deliveredFrom`', `deliveryDate`)
 * GadgetType turi talpinti tipus -> (PHONE, LAPTOP, TV, PERSONAL_COMPUTER, MICRO_CONTROLLER);
 * Duomenys turi būti skaitomi iš failo.
 *
 * Inicializuoti 3 `Person` objektus. Vienas `Person` objektas privalo turėti 1-3 `Gadget` objektus;
 * Privaloma naudoti abstrakčia klasę;
 * Atvaizduoti `Company` objektą kuris turi brangiausią `Gadget` objektą;
 * Atvaizduoti kurie žmonės gaus VISAS siuntas laiku;
 * Visa informacija išvedama į result.txt failą.*/