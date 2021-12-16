package MenusAndControllers;

import AccountFunctions.ChangeDetails;
import AccountFunctions.LoadAccounts;
import AccountFunctions.ViewAccount;

import java.util.Scanner;

public class AccountsMenuController {
    
    static int currentAccountIndex = LoginController.getCurrentAccountIndex();
    

    public static void callAccountsMenu() {
        System.out.println(Colours.ANSI_BLACK + "AMC.callAccountsMenu() called. ");
        AccountsMenuView.displayAccountMenu();
    }
    
    public static void parseEditAccountSelected() {
        System.out.println(Colours.ANSI_BLACK + "AMC.parseEditAccountSelected() called. ");
        System.out.println(Colours.ANSI_RED + "Please choose an option..." + Colours.ANSI_RESET);
        
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                ViewAccount.viewAccount(currentAccountIndex);
                parseAccountMenuChoice(currentAccountIndex);
            case 2:
                parseAccountMenuChoice(ViewAccount.viewAndSelectFromAllAccounts());
            default:
                System.out.println("Invalid choice, please try again...");
                AccountsMenuView.displayAccountMenu();
        }
    }
    
    
    public static void parseAccountMenuChoice(int account) {
        System.out.println(Colours.ANSI_BLACK + "AMC.parseAccountMenuChoice() called. .");
//        calls a display, displaying all possible fields with corresponding numbers, which is read and used
        AccountsMenuView.displayAccountEditMenu();
        System.out.println(Colours.ANSI_RED + "Please choose an option..." + Colours.ANSI_RESET);
        String[] properties = {"username", "password", "forename", "surname", "employee ID"};
        int propertyIndex = -1;
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
//                Change username
                LoginController.getAccounts().get(account).setUsername(ChangeDetails.changeDetails());
                propertyIndex = 0;
                break;
            case 2:
//                Change password
                LoginController.getAccounts().get(account).setPassword(ChangeDetails.changeDetails());
                propertyIndex = 1;
                break;
            case 3:
//                Change Forename
                LoginController.getAccounts().get(account).setForename(ChangeDetails.changeDetails());
                propertyIndex = 2;
                break;
            case 4:
//                Change Surname
                LoginController.getAccounts().get(account).setSurname(ChangeDetails.changeDetails());
                propertyIndex = 3;
                break;
            case 5:
//                Change EmployeeID if user is an admin;
                if (LoginController.getAccounts().get(currentAccountIndex).isAdmin()) {
                    LoginController.getAccounts().get(account).setEmployeeID(Integer.parseInt(ChangeDetails.changeDetails()));
                    propertyIndex = 4;
                }
                break;
            case 0:
//                Returns to main menu
                MainMenuView.displayMenu();
            default:
                System.out.println("Invalid Input. Please try again...");
                
                callAccountsMenu();
        }
        LoadAccounts.saveAccounts();
        if (propertyIndex >= 0) {
            System.out.println(Colours.ANSI_RED + "Successfully changed " + properties[propertyIndex] + ", Please re-login..." + Colours.ANSI_RESET);
        }
        
    }
    
}
