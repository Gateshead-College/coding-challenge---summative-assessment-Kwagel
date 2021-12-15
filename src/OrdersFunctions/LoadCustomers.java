package OrdersFunctions;

import MenusAndControllers.OrdersMenuController;
import Models.Customer;

import java.io.*;
import java.util.Scanner;

public class LoadCustomers {
    
    public static void loadCustomers(){
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Customers.txt")))) {
            OrdersMenuController.getCustomers().removeAll(OrdersMenuController.getCustomers());
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                OrdersMenuController.getCustomers().add(new Customer(data[0], Integer.parseInt(data[1]), data[2], data[3], data[4]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
//    public static void saveAccounts() throws IOException {
//        try (BufferedWriter bufferedWriter = (new BufferedWriter(new FileWriter("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Accounts.txt")))) {
//            for (Account a : LoginController.getAccounts()) {
//                bufferedWriter.write(a.getUsername() + "," + a.getPassword() + "," + a.getForename() + "," + a.getSurname() + "," + a.getEmployeeID() + "," + a.isAdmin() + "\n");
//            }
//        }
//    }
    
}
