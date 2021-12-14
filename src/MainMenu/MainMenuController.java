package MainMenu;

import Functions.*;

import java.io.FileWriter;
import java.io.IOException;

public class MainMenuController {
    
    public static void main(String[] args)throws IOException {
    LoginController.loadAccounts();
        LoadStock.loadStock();
        LoadStock.writeToRecord();
        LoginScreen.displayLogin();
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
            
        }
    }
    
}
