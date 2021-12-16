package MenusAndControllers;

import AccountFunctions.ViewAccount;
import StockFunctions.*;


import java.io.IOException;

public class MainMenuController {
    
    public static void main(String[] args) throws IOException {
//        Starting point
//        Load accounts, stock, write stock to stocksRecord.txt
        LoginController.loadAccounts();
        LoadStock.loadStock();
        LoadStock.writeToRecord();
//        display login screen
        LoginScreenView.displayLogin();
    }
    
    public void parseMainMenuChoice(int choice) {
        System.out.println(Colours.ANSI_BLACK + "MMC.parseMainMenuChoice() called. ");
        switch (choice) {
            case 1:
                StocksMenuController.callStocksMenu();
                MainMenuView.displayMenu();
                break;
            case 2:
                OrdersMenuController.callOrdersMenu();
                MainMenuView.displayMenu();
                break;
            case 3:
                AccountsMenuController.callAccountsMenu();
                MainMenuView.displayMenu();
                break;
            case 0:
                System.out.println("Exiting...");
            default:
                System.out.println("Invalid choice, please try again...");
                MainMenuView.displayMenu();
        }
    }
    
}
