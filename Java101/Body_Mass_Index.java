package Java101;
import java.util.Locale;
import java.util.Scanner;
public class Body_Mass_Index{
    public static void main(String[] args){
        double height,weight,index;
        Scanner input = new Scanner(System.in).useLocale(Locale.FRANCE);

        System.out.println("Please enter your height(m): ");
        height = input.nextDouble();

        System.out.println("Enter your weight(kg) : ");
        weight = input.nextDouble();


        index = weight/(height*height);


        System.out.println("Your body mass index : "+ index);
    }
}