package OrdersFunctions;

import MenusAndControllers.OrdersMenuController;
import Models.Order;
import Models.OrderItem;

import java.util.Scanner;

public class ViewOrders {
    public static void viewOrders() {
    for (int i = 0 ; i< OrdersMenuController.getOrders().size();i++){
        System.out.println("OrderID: " +(i+1)+ " Customer Name: " + OrdersMenuController.getOrders().get(i).getCustomerName() + " Total Cost: " + OrdersMenuController.getOrders().get(i).getTotalCost());
    }
    }
    
    public static void parseOrderSelection(){
        System.out.println("Please input an OrderID to view it in more detail...");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
                if (choice <= OrdersMenuController.getOrders().size()){
                    viewOrder(choice-1);
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
