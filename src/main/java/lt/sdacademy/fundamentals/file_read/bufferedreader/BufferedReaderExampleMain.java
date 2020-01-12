package lt.sdacademy.fundamentals.file_read.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class BufferedReaderExampleMain {

    public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            try {
             //   BufferedReader  br =  new BufferedReader(new FileReader("C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\lt\\sdacademy\\fundamentals\\file_read\\TextResourseTextFile.txt"));
                StringBuilder stringBuilder = new StringBuilder(); // visas failas
                String line; // viena eilute - kintamasis

                while (true) {
                    line = br.readLine(); // br - buffer reader
                    if (line == null) {
                        break;
                    }
                    stringBuilder.append(line);
                }

                do {
                    line = br.readLine();
                    stringBuilder.append(line);
                } while (line != null); // skaito mano teksta iki galo - null toje eiluteje

                System.out.println(stringBuilder.toString());

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
