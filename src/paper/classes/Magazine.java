package paper.classes;

public class Magazine extends Book {
    private String volume;

    public Magazine() {};

    public Magazine volume(short volume){
        this.volume = "No." + volume;
        return this;
    }

    @Override
    public Magazine title(String title){
        super.title(title);
        return this;
    }

    @Override
    public Magazine author(String author){
        super.author(author);
        return this;
    }

    @Override
    public Magazine year(int year){
        super.year(year);
        return this;
    }

    @Override
    public String getValues() {
        return "Title: " + super.title + "\nVolume: " + this.volume + "\nAuthor: " + super.author + "\nYear: " + super.year;
    }
}
