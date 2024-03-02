package paper.interfaces;

import java.util.ArrayList;

public interface IBook {
    ArrayList<String> genres = new ArrayList<>();

    public void addGenres(ArrayList<String> genres);
    public String getValues();
}
