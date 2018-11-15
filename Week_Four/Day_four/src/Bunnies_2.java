import java.util.Scanner;

public class Bunnies_2 {
    public static void main(String[] args) {
        System.out.println("How many rabbits dost thou desire?");
        Scanner blueEars = new Scanner(System.in);
        int rabbitEars = blueEars.nextInt();
        System.out.println(bunnyEarNumber(rabbitEars));
    }

    private static int bunnyEarNumber(int bunnyTotal) {
        int bunnyEars = 2;
        if (bunnyTotal == 1) {
            return bunnyEars;
        }  else {
            if (bunnyTotal % 2 == 0) {
                return bunnyEars + 1 + bunnyEarNumber(bunnyTotal - 1);
            }  else {
                return bunnyEars + bunnyEarNumber(bunnyTotal - 1);
            }
        }
    }
}


