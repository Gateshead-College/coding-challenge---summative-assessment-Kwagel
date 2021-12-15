package MenusAndControllers;

import StockFunctions.Colours;

import java.io.IOException;
import java.util.Scanner;

public class LoginScreenView {
    
    public static void displayLogin() throws IOException {
        LoginController.loadAccounts();
        System.out.println(Colours.ANSI_PURPLE + "_____________________________");
        System.out.println(" ENTER USERNAME:");
        System.out.println(" ENTER PASSWORD:");
        System.out.println("_____________________________" + Colours.ANSI_RESET);
        String username = new Scanner(System.in).nextLine();
        String password = new Scanner(System.in).nextLine();
        if (LoginController.checkLogin(username,password)) {
            System.out.println("Login successful...");
            System.out.println("Loading main menu...");
            MainMenuView.displayMenu();
        } else {
            System.out.println("Wrong password...");
            System.out.println("Please try again");
            displayLogin();
        }
    }
    
}
