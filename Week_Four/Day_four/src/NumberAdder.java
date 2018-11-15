import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        System.out.println("Type an integer:");
        Scanner limit = new Scanner(System.in);
        int num = limit.nextInt();
        int sumNumberAdder = numberAdder(num);
        System.out.println(sumNumberAdder);
    }

    private static int numberAdder(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + numberAdder(num - 1);
        }
    }
}
