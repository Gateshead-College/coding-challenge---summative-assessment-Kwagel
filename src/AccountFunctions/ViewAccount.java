package AccountFunctions;

import Models.Account;
import MenusAndControllers.Colours;
import MenusAndControllers.LoginController;
import MenusAndControllers.MainMenuView;

import java.util.Scanner;

public class ViewAccount {
    static int currentAccountIndex = LoginController.getCurrentAccountIndex();
    
    public static int getCurrentAccountIndex() {
        return currentAccountIndex;
    }
    
    public static void viewAccountSettings() {
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
        System.out.println("-------------------");
        
    }
    
    public static void parseAccountChoice(int account){
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
//                Change EmployeeID;
                if (LoginController.getAccounts().get(currentAccountIndex).isAdmin()) {
                    LoginController.getAccounts().get(account).setEmployeeID(Integer.parseInt(ChangeDetails.changeDetails()));
                    propertyIndex = 4;
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
        LoadAccounts.saveAccounts();
        if (propertyIndex >= 0) {
            System.out.println(Colours.ANSI_RED + "Successfully changed your " + properties[propertyIndex] + ", Please re-login..." + Colours.ANSI_RESET);
        }
    }
    
    public static int viewAllAccounts() {
        for (Account a : LoginController.getAccounts()) {
            System.out.println(Colours.ANSI_GREEN + "Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
        }
        System.out.println(Colours.ANSI_RED + "Please select an account by typing their Employee ID...");
        viewAccountSettings();
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public static void viewAccount(int accountIndex) {
        Account a = LoginController.getAccounts().get(accountIndex);
        System.out.println(Colours.ANSI_GREEN + "Account Details:");
        System.out.println("Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
    }
    
}
