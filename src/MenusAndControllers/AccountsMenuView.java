package MenusAndControllers;

import AccountFunctions.ViewAccount;

public class AccountsMenuView {
    
    
    public static void displayAccountMenu() {
        System.out.println(Colours.ANSI_BLACK + "AMV.displayAccountMenu() called. Displaying main menu...");
//        Called initially, then goes to method to check if user is admin or not.
        System.out.println(Colours.ANSI_GREEN +  "Account Menu");
        System.out.println("-------------------");
        accountChoice();
    }
    
    public static void displayAccountEditMenu(){
        System.out.println(Colours.ANSI_BLACK + "AMV.displayAccountEditMenu() called. ");
//        Displays editable fields for an accounts
        System.out.println(Colours.ANSI_GREEN + "-------------------");
        System.out.println("1 - Username");
        System.out.println("2 - Password");
        System.out.println("3 - Forename");
        System.out.println("4 - Surname");
        if (LoginController.getAccounts().get(AccountsMenuController.currentAccountIndex).isAdmin()) {
            System.out.println("5 - Employee ID");
        }
        System.out.println("0 - Return to Main Menu");
        System.out.println("-------------------");
    }
    public static void accountChoice() {
        System.out.println(Colours.ANSI_BLACK + "AMV.accountChoice() called. ");
//        if the account is an admin, can choose between his own account and other accounts
        if (LoginController.getAccounts().get(AccountsMenuController.currentAccountIndex).isAdmin()) {
            System.out.println(Colours.ANSI_GREEN + "Which account/s are you viewing/editing?");
            System.out.println("1 - Your own");
            System.out.println("2 - Others");
//            parses choice of selection
            AccountsMenuController.parseEditAccountSelected();
        } else {
//            otherwise, just directly print out own account information
            ViewAccount.viewAccount(AccountsMenuController.currentAccountIndex);
            AccountsMenuController.parseAccountMenuChoice(AccountsMenuController.currentAccountIndex);
        }
    }
    
}
