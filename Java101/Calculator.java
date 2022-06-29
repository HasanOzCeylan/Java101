package Java101;
import java.util.Scanner;

public  class Calculator{
    public  static void main(String[] args){
        int  n1,select;
        double n2;

        Scanner input = new Scanner(System.in);
        System.out.println("[1] Summation \n[2] Subtraction\n[3] Multiplication\n[4] Division");
        System.out.print("Enter a value : ");
        select  =  input.nextInt();

        switch (select){
            case 1:
                System.out.println("Enter first value:");
                n1 = input.nextInt();
                System.out.println("Enter second value:");
                n2 = input.nextInt();
                System.out.println("Sum of 2 numbers : "+(n1+n2));
                break;
            case 2:
                System.out.println("Enter first value:");
                n1 = input.nextInt();
                System.out.println("Enter second value:");
                n2 = input.nextInt();
                System.out.println("Subtract of 2 numbers : "+(n1-n2));
                break;
            case 3:
                System.out.println("Enter first value:");
                n1 = input.nextInt();
                System.out.println("Enter second value:");
                n2 = input.nextInt();
                System.out.println("Product of 2 numbers : "+(n1*n2));
                break;

            case 4:
                System.out.println("Enter first value:");
                n1 = input.nextInt();
                System.out.println("Enter second value:");
                n2 = input.nextInt();

                if (n2 != 0){
                    System.out.println("Division of 2 numbers : "+(n1 / n2));
                }
                else {
                    System.out.println("Can't divisible by -> 0");
                }
                break;
            default:
                System.out.println("You made the wrong choice. Try again.");
        }

    }
}