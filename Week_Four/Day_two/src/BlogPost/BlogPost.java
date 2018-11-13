package BlogPost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public String toString() {
        return "PostIt: " + this.authorName + ", " + this.title + ", " + this.text + ", " + this.publicationDate;
    }

    BlogPost(String authorName, String text, String title, String publicationDate) {
        this.authorName = authorName;
        this.text = text;
        this.title = title;
        this.publicationDate = publicationDate;
    }
}
