package MenusAndControllers;

import Models.Customer;
import Models.Order;
import OrdersFunctions.LoadCustomers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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
        OrdersMenuView.displayOrdersMenu();
        OrdersMenuView.parseOrderMenuChoice();
    }
    
}
