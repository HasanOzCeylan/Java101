package Java101;
import java.util.Scanner;
public class VAT_calculation {
    public static void main(String[] args) {
        double amount, vatRate,priceWithVat,vatAmount;
        boolean vatVariable;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        amount = input.nextDouble();
        System.out.println(amount);

       /*
       With if Command easier than boolean
       if (amount>1000) {
            vatRate=0.08;
        }
        */

        vatVariable=(0<amount) &&(1000>amount);
        vatRate=vatVariable ? 0.18 : 0.08;

        priceWithVat=amount+amount*vatRate;
        vatAmount=amount*vatRate;


        System.out.println("Price With VAT : "+priceWithVat);
        System.out.println("VAT amount : " +vatAmount);
        System.out.println("Amount without VAT : "+amount);
        System.out.println("Vat rate : "+ "%" + vatRate*100);


    }
}
