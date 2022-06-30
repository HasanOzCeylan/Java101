package Java101;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

                double heat;
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the heat:");
                heat = input.nextInt();

                if(heat < 5){
                    System.out.println("You can go to ski.");

                }else if (heat >=5 && heat < 25){
                    if(heat < 15){
                        System.out.println("You can go to the cinema.");
                    }else{
                        System.out.println("You can go to picnic.");
                    }
                }else{
                    System.out.println("You can go to swim.");
                }

            }
        }
