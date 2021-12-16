package MenusAndControllers;

import StockFunctions.*;

import java.util.Scanner;

public class StocksMenuController {
    
    
    public static void callStocksMenu() {
        System.out.println(Colours.ANSI_BLACK + "SMC.callStocksMenu() called. ");
        StocksMenuView.displayStockMenu();
    }
    
    public static void parseStockMenuChoice() {
        System.out.println(Colours.ANSI_BLACK + "SMC.parseStockMenuChoice() called. ");
        System.out.println(Colours.ANSI_RED + "Please choice an option..." + Colours.ANSI_RESET);
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                ViewStock.displayStocks();
                callStocksMenu();
            break;
            case 2:
                UpdateItem.updateItem();
                callStocksMenu();
                break;
            case 3:
                AddNewItem.addItem();
                callStocksMenu();
                break;
            case 4:
                RemoveItem.removeItem();
                callStocksMenu();
                break;
            case 0:
                MainMenuView.displayMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again...");
                callStocksMenu();
        }
    }
    
}
