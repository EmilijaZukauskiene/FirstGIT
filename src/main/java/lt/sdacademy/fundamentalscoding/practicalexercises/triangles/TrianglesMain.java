package lt.sdacademy.fundamentalscoding.practicalexercises.triangles;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeDefParticle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\triangles\\trianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\triangles\\triangle.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile(); //ivedame i faila
        countTrianglePerimeter(triangles);
        writeDateToFile(triangles);
    }

    private static List<Triangle> getTrianglesFromFile() { //failo nuskaitymui
        List<Triangle> triangles = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION));
            String line = br.readLine();

            while (line != null) {
                triangles.add(mapDataToModel(line));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Klaida");
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

        return triangles;
    }

    private static Triangle mapDataToModel(String lineData) {
        String[] splitedData = lineData.split(",");
        return new Triangle(
                Integer.parseInt(splitedData[0]),
                Integer.parseInt(splitedData[1]),
                Integer.parseInt(splitedData[2]),
                TriangleType.valueOf(splitedData[3])
        );
    }

    private static void countTrianglePerimeter(List<Triangle> triangles) {
        int perimeter;

        for (Triangle triangle : triangles) {
            perimeter = triangle.getA() + triangle.getB() + triangle.getC();
            triangle.setPerimeter(perimeter); // priskiriam kiekvienam objektui perimetra
        }
    }

    private static void writeDateToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {

            for (Triangle t : triangles) {
                bw.write(t.getTriangleType().getTriangleDescription()+ t.getPerimeter());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}
