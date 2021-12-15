package MenusAndControllers;

import OrdersFunctions.CreateNewOrder;
import StockFunctions.Colours;

import java.io.IOException;
import java.util.Scanner;

public class OrdersMenuView {
    public static void displayOrdersMenu() {
        System.out.println(Colours.ANSI_GREEN + "Orders Menu");
        System.out.println("------------");
        System.out.println("1 - Create New Order");
        System.out.println("2 - View Existing Orders");
        System.out.println("3 - Return to Main Menu" + Colours.ANSI_RESET);
    }
    
    public static void parseOrderMenuChoice() throws IOException {
        System.out.println(Colours.ANSI_RED + "Please choice an option..." + Colours.ANSI_RESET);
        switch (new Scanner(System.in).nextLine()) {
            case 1:
                CreateNewOrder.createNewOrder();
                break;
            case 2:
                ViewOrders.viewOrders();
                break;
            case 3:
                MainMenuView.displayMenu();
        }
    }
    
}
