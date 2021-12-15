package AccountFunctions;

import Models.Account;
import StockFunctions.Colours;
import MainMenu.LoginController;
import MainMenu.MainMenuView;

import java.io.IOException;
import java.util.Scanner;

public class ViewAccount {
    static int currentAccountIndex = LoginController.getCurrentAccountIndex();
    
    public static int getCurrentAccountIndex() {
        return currentAccountIndex;
    }
    
    public static void viewAccountSettings() {
        System.out.println(Colours.ANSI_GREEN + "Current Account Details:");
        System.out.println("-------------------");
        System.out.println("1 - Username");
        System.out.println("2 - Password");
        System.out.println("3 - Forename");
        System.out.println("4 - Surname");
        if (LoginController.getAccounts().get(currentAccountIndex).isAdmin()) {
            System.out.println("5 - Employee ID");
            System.out.println("6 - Change other employee's details");
        }
        System.out.println("0 - Return to Main Menu");
        System.out.println(Colours.ANSI_RED + "Please choose an option..." + Colours.ANSI_RESET);
        System.out.println("-------------------");
    }
    
    public static void parseAccountChoice(int account) throws IOException {
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
//                Change username
                LoginController.getAccounts().get(account).setUsername(ChangeDetails.changeDetails());
                System.out.println("Successfully changed your username, Please re-login..." + Colours.ANSI_RESET);
                break;
            case 2:
//                Change password
                LoginController.getAccounts().get(account).setPassword(ChangeDetails.changeDetails());
                System.out.println("Successfully changed your password, Please re-login..." + Colours.ANSI_RESET);
                break;
            case 3:
//                Change Forename
                LoginController.getAccounts().get(account).setForename(ChangeDetails.changeDetails());
                System.out.println("Successfully changed your forename, Please re-login..." + Colours.ANSI_RESET);
                break;
            case 4:
//                Change Surname
                LoginController.getAccounts().get(account).setSurname(ChangeDetails.changeDetails());
                System.out.println("Successfully changed your surname, Please re-login..." + Colours.ANSI_RESET);
                break;
            case 5:
//                Change EmployeeID;
                if (LoginController.getAccounts().get(currentAccountIndex).isAdmin()) {
                    LoginController.getAccounts().get(account).setEmployeeID(Integer.parseInt(ChangeDetails.changeDetails()));
                    System.out.println("Successfully changed your employee ID, Please re-login..." + Colours.ANSI_RESET);
                }
                break;
            case 6:
//                Change other employee's data if current account has admin privileges
                if (LoginController.getAccounts().get(currentAccountIndex).isAdmin()) {
                    parseAccountChoice(viewAllAccounts());
                }
                break;
            case 0:
                MainMenuView.displayMenu();
            default:
                System.out.println("Invalid Input...");
                viewAccountSettings();
        }
    }
    
    public static int viewAllAccounts() {
        for (Account a : LoginController.getAccounts()) {
            System.out.println("Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
        }
        System.out.println("Please select an account by typing their Employee ID...");
        viewAccountSettings();
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public static void viewAccount(int accountIndex) {
        Account a = LoginController.getAccounts().get(accountIndex);
        System.out.println("Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
    }
    
}
