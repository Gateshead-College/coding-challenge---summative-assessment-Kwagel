package OrdersFunctions;

import MenusAndControllers.OrdersMenuController;

import java.util.Scanner;

public class CreateNewOrder {
    public static void createNewOrder() {
        System.out.println("Please input customer ID...");
        int customerID = Integer.parseInt(new Scanner(System.in).nextLine());
        parseOrderDetails();
        
    }
    
    public int parseCustomerID(int customerID) {
        if (customerID <= OrdersMenuController.getCustomers().size() - 1 && customerID >= 0) {
            return customerID;
        }
        return -1;
    }
    
    public static void parseOrderDetails() {
        Scanner scanner = new Scanner(System.in);
        String moreProducts;
        do {
            System.out.println("Please input Product ID");
            int productID = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input amount bought...");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Do you still have more products? (y/n)");
            moreProducts = scanner.nextLine();
        } while (moreProducts.equals("y"));
    }
    
}
