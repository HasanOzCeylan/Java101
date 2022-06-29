package Java101;

import java.util.Scanner;

public class AccountCheck {
    public static void main(String[] args) {
        String userName, passWord, user, pass, newPassword;
        Scanner input = new Scanner(System.in);

        user = "Hans";
        pass = "12345";

        System.out.println("Enter Your Nickname : ");
        userName = input.nextLine();

        System.out.println("Enter your password : ");
        passWord = input.nextLine();

        if (userName.equals(user) && (passWord.equals(pass))) {
            System.out.println("You are logged in");}

             else{
                System.out.println("  You entered an incorrect password, if you want to set a new password select \"yes\"  or \" no\"    ");
                passWord=input.nextLine();

                if( passWord.equals("no")){
                    System.out.println(" Login terminated ");}

                else if (passWord.equals("yes")) {
                    System.out.println(" Type your new password ");
                    newPassword=input.nextLine();
                    pass = newPassword;
                    System.out.println("Your new password is" +pass);

                    if( newPassword.equals("12345")|| newPassword.equals(passWord)){
                        System.out.println(" Wrong login try again ");
                    }
                    else{
                        System.out.println(" Your password has been successfully reset ");

                    }

                }
                else{
                    System.out.println(" You made the wrong choice ");

                }

        }


    }
}