
/*package lt.sdacademy.fundamentalscoding.practicalexercises.worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class WorkersMain {

//    private static final String FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\worker\\WorkersData";

    public static void main(String[] args) {

        List<Worker> Workers = readDataFromFile();

        System.out.println("Vidutinis darbuotojo amzius: " + aerageYearOfWorker(Workers));
        System.out.println("Vidutinis darbuotoju užmokestis: " + averrageSalary(Workers));
        System.out.println("Daugiausiai uzdirbantis darbuotojas" + bigestSal(Workers));
        System.out.println("Jauniausias darbuotojas" + theYoungestWorker(Workers));
    }

    private static List<Worker> readDataFromFile() {
        List<Worker> Workers = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION));
            String line = br.readLine();

            while (line != null) {
                Workers.add(mapDataToModel(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

        return Workers;
    }

    private static Worker mapDataToModel(String lineData) {
        String[] spliteLine = line.split(",");
        return new Worker(splitedData[0], Integer.parseInt(splitedData[1]), Integer.parseInt(splitedData[2]), splitedLine[3]charToArray);
    }

    private static int aerageYearOfWorker(List<Worker> Workers) {
        int averageYearOfWorkers = 0;
        for (Worker Worker : Workers) {
            averageYearOfWorkers += Worker.getAge();
        }
        return (int) averageYearOfWorkers / Workers.size();
    }

    private static Integer averrageSalary(List<Worker> Workers) {
        Integer averrageSalary = 0;
        for (Worker Worker : Workers) {
            averrageSalary += Worker.getSalary();
        }
        return averrageSalary / Workers.size();
    }

    private static Integer bigestSal(List<Worker> Workers) {
        Integer bigestSal = Workers.get(0).getSalary();
        for (Worker worker : Workers) {
            if (bigestSal >= worker.getSalary()) {
                return bigestSal / Workers;
            }
            bigestSal = worker.getSalary();
            bigestSal = worker.getName();
            return bigestSal / Workers;
        }
    }

    private static int theYoungestWorker(List<Worker> Workers) {
        int theYoungestWorker = Workers.get(0).getAge();
        for (Worker worker : Workers) {
            if (theYoungestWorker > worker.getAge()) {
                theYoungestWorker = worker.getAge();
                theYoungestWorker = worker.getName();
            }
            return theYoungestWorker / Workers;
        }
    }
}*/