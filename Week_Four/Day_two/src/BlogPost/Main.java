package BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost postobj = new BlogPost("John Doe", "Lorem ipsum dolor sit amet", "Loren Ipsum", "2000.05.04");
        BlogPost postobj1 = new BlogPost("Tim Urban", "A popular long-form, stick-figure-illustrated blog about almost everything", "Wait But Why", "2010.10.10");
        BlogPost postobj2 = new BlogPost("William Turton", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28");

        System.out.println(postobj);
        System.out.println(postobj1);
        System.out.println(postobj2);

    }

}
