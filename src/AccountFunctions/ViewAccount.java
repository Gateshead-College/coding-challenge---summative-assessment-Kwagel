package AccountFunctions;

import Functions.Colours;
import MainMenu.LoginController;
import MainMenu.MainMenuView;

import java.io.IOException;
import java.util.Scanner;

public class ViewAccount {
    
    public void viewAccountSettings() throws IOException {
        System.out.println(Colours.ANSI_GREEN + "Current Account Details:");
        System.out.println("-------------------");
        System.out.println("Username :" + LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).getUsername());
        System.out.println("Password :" + LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).getPassword());
        System.out.println("Forename :" + LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).getForename());
        System.out.println("Surname :" + LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).getSurname());
        System.out.println("Employee ID :" + LoginController.getAccounts().get(LoginController.getCurrentAccountIndex()).getEmployeeID());
        System.out.println("-------------------");
        displayAccountOptions();
        
    }
    
    public void displayAccountOptions() throws IOException {
        System.out.println("1 - Change Password");
        System.out.println("2 - Return to Main Menu");
        System.out.println(Colours.ANSI_RED + "Please choose an option..." + Colours.ANSI_RESET);
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                ChangePassword.changePassword();
            case 2:
                MainMenuView.displayMenu();
            default:
                System.out.println("invalid Input...");
                displayAccountOptions();
        }
    }
    
}
