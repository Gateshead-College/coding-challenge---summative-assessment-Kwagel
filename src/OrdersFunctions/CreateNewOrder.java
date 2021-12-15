package OrdersFunctions;

import MenusAndControllers.OrdersMenuController;
import Models.Order;
import Models.OrderItem;
import Models.Stock;
import StockFunctions.Colours;
import StockFunctions.LoadStock;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewOrder {
    static int currentOrderIndex;
    
    public static void createNewOrder() {
        System.out.println("Please input customer ID...");
        int customerID = Integer.parseInt(new Scanner(System.in).nextLine());
        if (parseCustomerID(customerID) > 0) {
            ArrayList<Order> tempOrders = OrdersMenuController.getOrders();
            tempOrders.add(new Order(customerID));
            
            for (int i = 0; i < tempOrders.size(); i++) {
                if (tempOrders.get(i).getCustomerID() == customerID) {
                    currentOrderIndex = i;
                }
            }
            parseOrderDetails();
            
        }
        
    }
    
    public static int parseCustomerID(int customerID) {
        if (customerID <= OrdersMenuController.getCustomers().size() - 1 && customerID >= 0) {
            return customerID;
        }
        
        return -1;
    }
    
    public static void parseOrderDetails() {
        Scanner scanner = new Scanner(System.in);
        String moreProducts;
        do {
            System.out.println(Colours.ANSI_RED + "Please input Product ID");
            int productID = Integer.parseInt(scanner.nextLine());
            while(!Stock.checkProductID(productID)){
                System.out.println("Product doesn't exist, please try again");
                productID = Integer.parseInt(scanner.nextLine());;
            }
            
            System.out.println("Please input amount bought...");
            int quantity = Integer.parseInt(scanner.nextLine());
            while(!Stock.checkQuantity(productID, quantity)){
                System.out.println("We don't have that many in stock, please try again...");
                quantity = Integer.parseInt(scanner.nextLine());;
            }
            OrdersMenuController.getOrders().get(currentOrderIndex).addOrderItems(new OrderItem(productID, quantity));
            System.out.println("Added items...");
            System.out.println("Do you still have more products? (y/n)" + Colours.ANSI_RESET);
            moreProducts = scanner.nextLine();
        } while (moreProducts.equals("y"));
    }
    
}
