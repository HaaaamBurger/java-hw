package post;

import post.classes.Comment;
import post.classes.Post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post(1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1, "qui est esse", "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut");
        Post post4 = new Post(1, "id labore ex et quam laborum", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium");
        Post post5 = new Post(1, "quo vero reiciendis velit similique earum", "est natus enim nihil est dolore omnis voluptatem numquam\\net omnis occaecati quod ullam at\\nvoluptatem error expedita pariatur\\nnihil sint nostrum voluptatem reiciendis et");
        Post post6 = new Post(1, "odio adipisci rerum aut animi", "quia molestiae reprehenderit quasi aspernatur\\naut expedita occaecati aliquam eveniet laudantium\\nomnis quibusdam delectus saepe quia accusamus maiores nam est\\ncum et ducimus et vero voluptates excepturi deleniti ratione");
        Post post7 = new Post(2, "repellat consequatur praesentium vel minus molestias voluptatum", "maiores sed dolores similique labore et inventore et\\nquasi temporibus esse sunt id et\\neos voluptatem aliquam\\naliquid ratione corporis molestiae mollitia quia et magnam dolor");
        Post post8 = new Post(3, "et omnis dolorem", "ut voluptatem corrupti velit\\nad voluptatem maiores\\net nisi velit vero accusamus maiores\\nvoluptates quia aliquid ullam eaque");
        Post post9 = new Post(3, "et officiis id praesentium hic aut ipsa dolorem repudiandae", "vel quae voluptas qui exercitationem\\nvoluptatibus unde sed\\nminima et qui ipsam aspernatur\\nexpedita magnam laudantium et et quaerat ut qui dolorum");
        Post post10 = new Post(3, "debitis magnam hic odit aut ullam nostrum tenetur", "nihil ut voluptates blanditiis autem odio dicta rerum\\nquisquam saepe et est\\nsunt quasi nemo laudantium deserunt\\nmolestias tempora quo quia");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        posts.add(post6);
        posts.add(post7);
        posts.add(post8);
        posts.add(post9);
        posts.add(post10);


        ArrayList<Comment> comments = new ArrayList<>();

        Comment comment1 = new Comment("comment1");
        Comment comment2 = new Comment("comment2");
        Comment comment3 = new Comment("comment3");
        Comment comment4 = new Comment("comment4");
        Comment comment5 = new Comment("comment5");
        Comment comment6 = new Comment("comment6");
        Comment comment7 = new Comment("comment7");
        Comment comment8 = new Comment("comment8");
        Comment comment9 = new Comment("comment9");
        Comment comment10 = new Comment("comment10");

        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);
        comments.add(comment6);
        comments.add(comment7);
        comments.add(comment8);
        comments.add(comment9);
        comments.add(comment10);

        for(Post post : posts) {
            int postId = post.getId();

            for(Comment comment : comments) {
                int commentId = comment.getId();

                if(postId == commentId) {
                    post.addComment(comment);
                }
            }
        }

        System.out.println(posts);

    }

}
