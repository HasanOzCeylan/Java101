package Java101;
import java.util.Scanner;
public class GreenGrocer{
    public static void main(String[] args){
        double p,a,t,b,e,pears=2.14,apples=3.67,tomatoes=1.11,banana=0.95, eggplant=5.0,total;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the amount of pears you bought in kg.:");
        p=inp.nextDouble();
        System.out.print("Enter the amount of apples you bought in kg.:");
        a=inp.nextDouble();
        System.out.print("Enter the amount of tomatoes you bought in kg.:");
        t=inp.nextDouble();
        System.out.print("Enter the amount of banana you bought in kg.:");
        b=inp.nextDouble();
        System.out.print("Enter the amount of eggplant you bought in kg.");
        e=inp.nextDouble();
        total=p*pears+a*apples+t*tomatoes+b*banana+e*eggplant;
        System.out.println("Total amount you have to pay:"+total);


    }
}