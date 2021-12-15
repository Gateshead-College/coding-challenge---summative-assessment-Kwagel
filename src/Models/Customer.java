package Models;

import MenusAndControllers.OrdersMenuController;

public class Customer {
     String name;
     int accountNumber;
     String email;
     String Telephone;
     String Address;
     
     public Customer(String name, int accountNumber, String email, String telephone, String address) {
          this.name = name;
          this.accountNumber = accountNumber;
          this.email = email;
          Telephone = telephone;
          Address = address;
     }
     public Customer(String name, String email, String telephone, String address) {
          this.name = name;
          this.accountNumber = OrdersMenuController.getCustomers().size();
          this.email = email;
          Telephone = telephone;
          Address = address;
     }
     
}
