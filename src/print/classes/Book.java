package print.classes;

import print.interfaces.IPrintable;

import java.util.ArrayList;

public class Book implements IPrintable {
    private String title;
    private int pages;
    private String[] genres;

    public Book(String title, int pages, String[] genres) {
        this.title = title;
        this.pages = pages;
        this.genres = genres;
    }

    @Override
    public void print() {
        System.out.print("Title: " + this.title + "\nPages: " + this.pages + "\nGenres: " + this.genres);
    }
}
