package lt.sdacademy.advanced_features.json.fromJson;

import com.google.gson.Gson;
import lt.sdacademy.advanced_features.json.toJson.Staff;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class FromJsonExample {

    private static final Logger logger = Logger.getLogger(FromJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/streams/exercises/personaldata/PersonalData.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

            logger.info("Data data was read succesfully");
        } catch (IOException e) { // skirtas tik failo lokacijai gaudyti
            logger.error("Error occured while reader file!");
        }
    }
}
