package OrdersFunctions;

import MenusAndControllers.OrdersMenuController;
import Models.Order;
import Models.OrderItem;
import MenusAndControllers.Colours;

import java.io.IOException;
import java.util.Scanner;

public class ViewOrders {
    public static void viewOrders() {
    for (int i = 0 ; i< OrdersMenuController.getOrders().size();i++){
        System.out.println("OrderID: " +(i+1)+ " Customer Name: " + OrdersMenuController.getOrders().get(i).getCustomerName() + " Total Cost: " + OrdersMenuController.getOrders().get(i).getTotalCost());
    }
        System.out.println(OrdersMenuController.getOrders().size() + " - Exit");
        try {
            parseOrderSelection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void parseOrderSelection() throws IOException {
        System.out.println(Colours.ANSI_RED + "Please input an OrderID to view it in more detail...");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
                if (choice <= OrdersMenuController.getOrders().size()-1){
                    viewOrder(choice-1);
                }else if (choice == OrdersMenuController.getOrders().size()){
                    System.out.println(Colours.ANSI_RED + "Returning to Orders Menu...");
//                    OrdersMenuView.displayOrdersMenu();
                }
    }
    public static void viewOrder(int index){
        Order tempOrder =  OrdersMenuController.getOrders().get(index);
        System.out.println("Customer ID: " + tempOrder.getCustomerID());
        System.out.println("Customer Name: " + tempOrder.getCustomerName() + "\n");
        System.out.println("Items Ordered");
        for (OrderItem o : tempOrder.getOrderItems()){
            System.out.println(o.getProductID() + " - " + o.getProductName()  + " - " + o.getQuantity()  + " - " + o.getUnitCost()  + " - " + o.getTotalCostOI());
        }
        System.out.println("Total cost of order " + tempOrder.getTotalCost() );
    }
}
