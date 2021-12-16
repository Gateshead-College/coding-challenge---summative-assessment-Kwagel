package AccountFunctions;

import Models.Account;
import MenusAndControllers.Colours;
import MenusAndControllers.LoginController;
import MenusAndControllers.MainMenuView;

import java.util.Scanner;

public class ViewAccount {

    public static int viewAndSelectFromAllAccounts() {
        System.out.println(Colours.ANSI_BLACK + "ViewAccount.viewAndSelectFromAllAccounts() called. ");
//        loops through all accounts, prints the information
        for (Account a : LoginController.getAccounts()) {
            System.out.println(Colours.ANSI_GREEN + "Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
        }
        System.out.println(Colours.ANSI_RED + "Please select an account by typing their Employee ID...");
//          select and return an account employee ID for editing
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public static void viewAccount(int accountIndex) {
        System.out.println(Colours.ANSI_BLACK + "ViewAccount.viewAccount() called. ");
        Account a = LoginController.getAccounts().get(accountIndex);
        System.out.println(Colours.ANSI_GREEN + "Account Details:");
        System.out.println("Employee ID: " + a.getEmployeeID() + " Username: " + a.getUsername() + " Password: " + a.getPassword() + " Forename: " + a.getForename() + " Surname: " + a.getSurname() + " Admin Privileges: " + a.isAdmin());
    }
    
}
