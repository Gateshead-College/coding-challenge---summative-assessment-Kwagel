package Models;


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
   
     
     public String getName() {
          return name;
     }
     
     public int getAccountNumber() {
          return accountNumber;
     }
     
 
}
