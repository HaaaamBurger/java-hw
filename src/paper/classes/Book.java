package paper.classes;

import paper.abstractions.Papirus;
import paper.interfaces.IBook;

import java.util.ArrayList;

public class Book extends Papirus implements IBook {
    protected ArrayList<String> genres;
    public Book(){};

    public Book genres(ArrayList<String> genres) {
        this.genres = genres;
        return this;
    }

    @Override
    public Book title(String title){
        super.title(title);
        return this;
    }

    @Override
    public Book author(String author){
        super.author(author);
        return this;
    }

    @Override
    public Book year(int year){
        super.year(year);
        return this;
    }

    @Override
    public void addGenres(ArrayList<String> genres) {
        if (this.genres == null) {
            this.genres = new ArrayList<>();
        }
        this.genres.addAll(genres);
    }
    @Override
    public String getValues() {
        return "Title: " + super.title + "\nAuthor: " + super.author + "\nYear: " + super.year + "\nGenres: " + this.genres;
    }
}
