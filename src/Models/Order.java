package Models;

import MenusAndControllers.OrdersMenuController;
import StockFunctions.LoadStock;

import java.util.ArrayList;

public class Order {
    private int customerID;
    private ArrayList<OrderItem> orderItems;
    private double totalCost;
    
    public Order(int customerID) {
        this.customerID = OrdersMenuController.getCustomers().get(customerID).getAccountNumber();
        this.orderItems = new ArrayList<OrderItem>();
        this.totalCost = 0;
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    public String getCustomerName() {
        for (int i = 0; i < OrdersMenuController.getCustomers().size(); i++) {
            if (OrdersMenuController.getCustomers().get(i).getAccountNumber() == customerID) {
                return OrdersMenuController.getCustomers().get(i).getName();
            }
        }
        return "failed to get customer name";
    }
    
    public void calculateCost() {
        double total = 0;
        
        for (OrderItem o : this.orderItems) {
            for (int i = 0; i < LoadStock.getStocks().size(); i++) {
                if (LoadStock.getStocks().get(i).getProductID() == o.getProductID()) {
                    total += LoadStock.getStocks().get(i).getPrice() * o.getQuantity();
                }
            }
            this.totalCost = total;
        }
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
    
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public void addOrderItems(OrderItem orderItems) {
        this.orderItems.add(orderItems);
        calculateCost();
    }
    
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
    
}
