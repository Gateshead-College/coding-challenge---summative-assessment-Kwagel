package MenusAndControllers;

import Models.Customer;
import Models.Order;
import OrdersFunctions.CreateNewOrder;
import OrdersFunctions.LoadCustomers;
import OrdersFunctions.ViewOrders;

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
    
    public static void callOrdersMenu() {
        LoadCustomers.loadCustomers();
        displayOrdersMenu();
        
    }
    
    public static void parseOrderMenuChoice() {
        System.out.println(Colours.ANSI_BLACK + "OMC.parseOrderMenuChoice() called. ");
        System.out.println(Colours.ANSI_RED + "Please choice an option..." + Colours.ANSI_RESET);
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                CreateNewOrder.createNewOrder();
                displayOrdersMenu();
                break;
            case 2:
                ViewOrders.viewOrders();
                displayOrdersMenu();
                break;
            case 0:
                MainMenuView.displayMenu();
            default:
                System.out.println("Invalid input, please try again...");
                displayOrdersMenu();
            
        }
    }
    
}
