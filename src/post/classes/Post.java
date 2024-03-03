package post.classes;

import java.util.ArrayList;

public class Post {
    private int postId;
    private static int id;
    private int fileId;
    private String title;
    private String body;
    private ArrayList<Comment> comments;

    public Post(int postId, String title ,String body) {
        id++;
        this.fileId = id;

        this.postId = postId;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return this.fileId;
    }

    public void addComment(Comment comment) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(comment);
    }

    public String toString() {
        return "\npostId: " + this.postId + "\nfileId: " + this.fileId + "\ntitle: " + this.title + "\nbody: " + this.body + "\nComments: " + this.comments + "\n";
    }
}
