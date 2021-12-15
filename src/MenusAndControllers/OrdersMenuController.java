package MenusAndControllers;

import Models.Customer;
import Models.Order;
import OrdersFunctions.CreateNewOrder;
import OrdersFunctions.LoadCustomers;
import OrdersFunctions.ViewOrders;
import StockFunctions.Colours;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static MenusAndControllers.OrdersMenuView.displayOrdersMenu;

public class OrdersMenuController {
        static ArrayList<Order> orders = new ArrayList<>();
     static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Order> getOrders() {
        return orders;
    }
    
    public static ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public static void loadOrdersMenu() throws IOException {
        LoadCustomers.loadCustomers();
        displayOrdersMenu();
        parseOrderMenuChoice();
    }
    public static void parseOrderMenuChoice() throws IOException {
        System.out.println(Colours.ANSI_RED + "Please choice an option..." + Colours.ANSI_RESET);
        switch (Integer.parseInt( new Scanner(System.in).nextLine())) {
            case 1:
                CreateNewOrder.createNewOrder();
                displayOrdersMenu();
                parseOrderMenuChoice();
                break;
            case 2:
                ViewOrders.viewOrders();
                ViewOrders.parseOrderSelection();
                displayOrdersMenu();
                parseOrderMenuChoice();
                break;
            case 3:
                MainMenuView.displayMenu();
            default:
                System.out.println("Invalid input, please try again...");
                displayOrdersMenu();
                parseOrderMenuChoice();
        }
    }
}
