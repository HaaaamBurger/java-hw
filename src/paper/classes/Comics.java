package paper.classes;

import paper.interfaces.IComics;

import java.util.ArrayList;

public class Comics extends Book implements IComics {
    private String illustrator;

    public Comics illustrator(String illustrator){
        this.illustrator = illustrator;
        return this;
    }

    @Override
    public Comics title(String title){
        super.title(title);
        return this;
    }

    @Override
    public Comics author(String author){
        super.author(author);
        return this;
    }

    @Override
    public Comics year(int year){
        super.year(year);
        return this;
    }

    @Override
    public void addGenres(ArrayList<String> genres) {
        if (super.genres == null) {
            super.genres = new ArrayList<>();
        }
        super.genres.addAll(genres);
    }

    @Override
    public String getValues() {
        return "Title: " + super.title + "\nAuthor: " + super.author + "\nIllustrator: " + this.illustrator + "\nYear: " + super.year + "\nGenres: " + this.genres;
    }

}
