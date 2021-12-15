package MenusAndControllers;

import AccountFunctions.ViewAccount;
import StockFunctions.*;


import java.io.IOException;

public class MainMenuController {
    
    public static void main(String[] args)throws IOException {
    LoginController.loadAccounts();
        LoadStock.loadStock();
        LoadStock.writeToRecord();
        LoginScreenView.displayLogin();
    }
    
    public void parseChoice(int choice) throws IOException {
        switch (choice){
            case 1:
                ViewStock.displayStocks();
                MainMenuView.displayMenu();
            case 2:
                UpdateItem.updateItem();
                MainMenuView.displayMenu();
            case 3:
                AddNewItem.addItem();
                MainMenuView.displayMenu();
            case 4:
                RemoveItem.removeItem();
                MainMenuView.displayMenu();
            case 5:
                OrdersMenuController.loadOrdersMenu();
            case 6:
                ViewAccount.viewAccount(ViewAccount.getCurrentAccountIndex());
                ViewAccount.viewAccountSettings();
                ViewAccount.parseAccountChoice(ViewAccount.getCurrentAccountIndex());
                MainMenuView.displayMenu();
        }
    }
    
}
