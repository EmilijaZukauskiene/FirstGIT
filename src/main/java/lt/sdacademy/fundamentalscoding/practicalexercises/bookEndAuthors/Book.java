package lt.sdacademy.fundamentalscoding.practicalexercises.bookEndAuthors;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private Double price;
    private int qnt;

    public Book(String title, List<Author> authors, Double price, int qnt) {

        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qnt = qnt; // kiekis
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }


    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    @Override
    public String toString() {
        return String.format("Knygos pavadinimas: %s, %s", title, authors.get(0).toString());
    }
}
