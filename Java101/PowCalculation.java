package Java101;
import java.util.Scanner;

public class PowCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for base: ");
        int number = input.nextInt();
        System.out.print("Enter a number for top: ");
        int times = input.nextInt();
        int total = 1;

        for (int i = 1; i <= times; i++) {
            total *= number;
        }
        System.out.print(total);

    }
}

