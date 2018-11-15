import java.util.Scanner;

public class Bunnies {
    public static void main(String[] args) {
        System.out.println("How many rabbits would you like?");
        Scanner bun = new Scanner(System.in);
        int bunnyTotal = bun.nextInt();
        System.out.println(bunnyEarNumber(bunnyTotal));

    }
    private static int bunnyEarNumber(int bunnyTotal) {

        int bunnyEars = 2;
        if (bunnyTotal == 1) {
            return bunnyEars;
        } else {
            return bunnyEars + bunnyEarNumber(bunnyTotal - 1);
        }
    }
}
