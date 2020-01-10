
package lt.sdacademy.fundamentalscoding.practicalexercises.bookEndAuthors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class BookAndAuthorsMain {
    private static final String FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\bookEndAuthors\\BooksData.txt";

    public static void main(String[] args) {
        List<Book> bookList = ReadDataFromFile();

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    private static List<Book> ReadDataFromFile() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\bookEndAuthors\\BooksData.txt"))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                bookList.add(mapBookData(line));
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila");
        }
        return bookList;
    }

    private static Book mapBookData(String bookData) {
        String[] splitedLineData = bookData.split(",");
        return new Book(splitedLineData[0], mapAuthorData(splitedLineData[1]), Double.parseDouble(splitedLineData[2]), Integer.parseInt(splitedLineData[3]));
    }

    private static List<Author> mapAuthorData(String authorData) {
        List<Author> authors = new ArrayList<>();
        String[] splitedLineData = authorData.split(",");
        if (splitedLineData.length == 0) {
            String[] authorsData = authorData.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        for (String authorsInfo : splitedLineData) {
            String[] authorsData = authorsInfo.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        return authors;
    }
}