package Models;

import java.util.ArrayList;

public class Order {
    private int customerID;
    private ArrayList< OrderItem> orderItems;
    private int totalCost;
    
    public Order(int customerID, ArrayList<OrderItem> orderItems) {
        this.customerID = customerID;
        this.orderItems = orderItems;
    }
    
}
