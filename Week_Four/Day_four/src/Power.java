import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        System.out.println("Type a random number:");
        Scanner pow = new Scanner(System.in);
        int numeral = pow.nextInt();
        int n = 2;
        System.out.println(powerNo(numeral, n));

    }

    public static int powerNo(int numeral,int n){
        if (n == 0) {
            return 1;
        } else
            return numeral * powerNo(numeral, n -1);
    }
}