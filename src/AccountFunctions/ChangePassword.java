package AccountFunctions;

import Functions.Colours;
import MainMenu.LoginController;

import java.util.Scanner;

public class ChangePassword {
    
    public static void changePassword() {
        System.out.println(Colours.ANSI_RED + "Enter new password...");
        String newPassword = new Scanner(System.in).nextLine();
        System.out.println("Please confirm your password by re-entering it...");
        if (new Scanner(System.in).nextLine().equals(newPassword)){
            LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).setPassword(newPassword);
            System.out.println("Successfully changed your password, Please re-login..." + Colours.ANSI_RESET);
        }else{
            System.out.println("Your passwords didnt match, please try again...");
            changePassword();
        }
    }
    
}
