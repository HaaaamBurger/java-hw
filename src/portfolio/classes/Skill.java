package portfolio.classes;

public class Skill {
    protected String title;
    protected short exp;

    public Skill(String title, short exp) {
        this.title = title;
        this.exp = exp;
    }

    public String toString() {
        return "{" + "\n\tTitle: " + this.title +
                "\n\tExp: " + this.exp +
                "\n}";
    }
}
