package Java101;
import java.util.Scanner;
public class Java_calculating_course_grades{
    public  static void main(String[]  args ){
        int mat,phy,che,eng,his,mus;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your math grade");
        mat = input.nextInt();

        System.out.println("Enter your physics grade");
        phy = input.nextInt();

        System.out.println("Enter your chemistry grade");
        che = input.nextInt();

        System.out.println("Enter your english grade");
        eng = input.nextInt();

        System.out.println("Enter your history grade");
        his = input.nextInt();

        System.out.println("Enter your music grade");
        mus = input.nextInt();

        double total = (mat+phy+che+eng+his+mus);
        double result = total/6;

        System.out.println("Your Average : "+result);

        boolean  a = result >=60;
        String  passed = a ? "Passed the Class" : "Failed the Class";

        System.out.println(passed);


    }
}