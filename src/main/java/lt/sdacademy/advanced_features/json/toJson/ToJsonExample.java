package lt.sdacademy.advanced_features.json.toJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class ToJsonExample {

    private static final Logger logger = Logger.getLogger(ToJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/json/utils/file1.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        Staff staff = Staff.buildStaff();

        String staffInson = gson.toJson(staff);
        logger.info(staffInson);

        try (FileWriter writer = new FileWriter(INPUT_FILE_LOCATION)) {
            gson.toJson(staffInson, writer);
            logger.info("Information was succesfully wrote into file.");
        } catch (IOException e) {
            logger.error("File not found!");
        }
    }
}
