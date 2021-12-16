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
//        checks username and password against accounts arraylist
        if (LoginController.checkLogin(username, password)) {
            System.out.println(Colours.ANSI_RED + "Login successful...");
            System.out.println(Colours.ANSI_RED + "Loading main menu...");
            MainMenuView.displayMenu();
        } else {
            System.out.println(Colours.ANSI_RED + "Wrong password...");
            System.out.println(Colours.ANSI_RED + "Please try again");
            displayLogin();
        }
    }
    
}
