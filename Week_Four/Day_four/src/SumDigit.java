import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println("Type in an integer:");
        Scanner addme = new Scanner(System.in);
        int number = addme.nextInt();
        int sumNumberDigit = numberDigitSum(number);
        System.out.println(sumNumberDigit);
    }

    private static int numberDigitSum(int number) {
        if (number == 0) {
            return 0;
        } else
            return (number % 10) + numberDigitSum(number / 10);
    }
}
