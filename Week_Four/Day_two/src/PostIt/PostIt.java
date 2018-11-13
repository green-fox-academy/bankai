package PostIt;

public class PostIt {
    String backgroundColor;
    String textColor;
    String text;

    public String toString() {return "PostIt: " + this.backgroundColor + ", " + this.textColor + ", " + this.text;}

    PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
}
