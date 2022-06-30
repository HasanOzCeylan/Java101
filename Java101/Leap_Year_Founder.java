package Java101;

import java.util.Scanner;

public class Leap_Year_Founder {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        year = input.nextInt();
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " its a leap year.");
                } else {
                    System.out.println(year + " not a leap year.");
                }
            } else {
                System.out.println(year + " its a leap year.");
            }
        } else {
            System.out.println(year + " not a leap year.");
        }
    }
}

