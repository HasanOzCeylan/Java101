package Java101;

import java.util.Scanner;

public class Chinese_Zodiac {

    public static void main(String[] args) {
        int zodyear;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year and find out your zod age :");
        zodyear = input.nextInt();

        switch (zodyear%12){
            case 0:
                System.out.println("Your Chinese Zodiac Sign : Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Sign : Cockerel");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Sign : Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Sign : Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Sign : Mouse");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Sign : Bull");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Sign : Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Sign : Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Sign : Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Sign : Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Sign : Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Sign : Sheep");
                break;

            default:
                System.out.println("Incorrect Entry");
                break;



        }

    }
}