package Java101;
import java.util.Scanner;

public class PowersOf4and5{
    public  static void main(String[] args){
        int powerOf4,number,powerOf5;
        Scanner input =  new Scanner(System.in);

        System.out.print("Please enter a number : ");
        number = input.nextInt();

        powerOf4 = 0;
        for (int i = 1; i <= number; i *= 4){
            System.out.println("4 ^ " + powerOf4 + " : " + i);
            powerOf4++;
        }
        System.out.println("_______________________________");

        powerOf5 = 0;
        for (int i = 1; i < number; i *=5) {
            System.out.println("5 ^ " + powerOf5 + " : " + i);
            powerOf5++;

        }



    }

}