public class Counter {
    public static void main(String[] args) {

        countToNil(10);
    }

    public static int countToNil(int from) {

        if (from == 0){
            System.out.println(0);
            return 0;
        } else {
            System.out.println(from);
            return countToNil(from - 1);
        }

    }
}
