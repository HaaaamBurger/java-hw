package post.classes;

public class Comment {
    private static int id;
    private int fileId;

    private String comment;

    public Comment(String comment) {
        id++;
        this.fileId = id;

        this.comment = comment;
    }

    public int getId() {
        return this.fileId;
    }

    public String toString() {
        return "\n\tid:" + this.fileId + "\n\tcomment: " + this.comment + "\n\t";
    }
}
