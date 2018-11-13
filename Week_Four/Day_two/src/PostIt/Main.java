package PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt atr = new PostIt("orange", "Idea1", "blue");
        PostIt atr1 = new PostIt("pink", "Awesome", "black");
        PostIt atr2 = new PostIt("yellow", "Superb!", "green");

        System.out.println(atr);
        System.out.println(atr1);
        System.out.println(atr2);

    }
}
