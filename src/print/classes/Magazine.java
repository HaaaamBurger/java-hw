package print.classes;

import print.interfaces.IPrintable;

import java.util.ArrayList;

public class Magazine implements IPrintable {
    private String illustrator;
    private int pages;
    private String[] themes;

    public Magazine(String illustrator, int pages, String[] themes) {
        this.illustrator = illustrator;
        this.pages = pages;
        this.themes = themes;
    }

    @Override
    public void print() {
        System.out.print("Illustrator: " + this.illustrator + "\nPages: " + this.pages + "\nThemes: " + this.themes);
    }
}
