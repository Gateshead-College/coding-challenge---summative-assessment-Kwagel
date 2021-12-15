package MenusAndControllers;

import OrdersFunctions.CreateNewOrder;
import OrdersFunctions.ViewOrders;
import StockFunctions.Colours;

import java.io.IOException;
import java.util.Scanner;

public class OrdersMenuView {
    public static void displayOrdersMenu() throws IOException {
        System.out.println(Colours.ANSI_GREEN + "Orders Menu");
        System.out.println("-------------------");
        System.out.println("1 - Create New Order");
        System.out.println("2 - View Existing Orders");
        System.out.println("3 - Return to Main Menu" + Colours.ANSI_RESET);
        System.out.println("-------------------");
        OrdersMenuController.parseOrderMenuChoice();
    }
    
   
    
}
