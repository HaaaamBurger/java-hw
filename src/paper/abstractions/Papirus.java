package paper.abstractions;

import paper.interfaces.IPapirus;

public abstract class Papirus implements IPapirus {
    protected String title = "Unknown";
    protected String author = "Unknown";
    protected int year = 0;

    protected Papirus() {}

    protected Papirus title(String title) {
        this.title = title;
        return this;
    }
    protected Papirus author(String author) {
        this.author = author;
        return this;
    }
    protected Papirus year(int year) {
        this.year = year;
        return this;
    }


    @Override
    public String getValues(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year;
    };
}
