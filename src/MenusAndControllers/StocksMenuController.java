package MenusAndControllers;

import StockFunctions.*;

import java.util.Scanner;

public class StocksMenuController {
    
    
    public static void callStocksMenu() {
        StocksMenuView.displayStockMenu();
    }
    
    public static void parseChoice() {
        System.out.println(Colours.ANSI_RED + "Please choice an option..." + Colours.ANSI_RESET);
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
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
                MainMenuView.displayMenu();
            default:
                System.out.println("Invalid choice, please try again...");
                callStocksMenu();
        }
    }
    
}
