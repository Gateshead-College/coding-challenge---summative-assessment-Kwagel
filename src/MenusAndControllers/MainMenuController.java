package MenusAndControllers;

import AccountFunctions.ViewAccount;
import StockFunctions.*;


import java.io.IOException;

public class MainMenuController {
    
    public static void main(String[] args)throws IOException {
//        Starting point
//        Load accounts, stock, write stock to stocksRecord.txt
    LoginController.loadAccounts();
        LoadStock.loadStock();
        LoadStock.writeToRecord();
//        display login screen
        LoginScreenView.displayLogin();
    }
    
    public void parseMainMenuChoice(int choice) {
        switch (choice){
            case 1:
                StocksMenuController.callStocksMenu();
            case 2:
                OrdersMenuController.callOrdersMenu();
            case 3:
                ViewAccount.viewAccount(ViewAccount.getCurrentAccountIndex());
                ViewAccount.viewAccountSettings();
                ViewAccount.parseAccountChoice(ViewAccount.getCurrentAccountIndex());
                MainMenuView.displayMenu();
        }
    }
    
}
