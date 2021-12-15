package AccountFunctions;

import MenusAndControllers.LoginController;
import Models.Account;

import java.io.*;
import java.util.Scanner;

public class LoadAccounts {
    public static void loadAccounts() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Accounts.txt")))) {
            LoginController.getAccounts().removeAll(LoginController.getAccounts());
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                LoginController.getAccounts().add(new Account(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), Boolean.parseBoolean(data[5])));
            }
        }
    }
    
    public static void saveAccounts() throws IOException {
        try (BufferedWriter bufferedWriter = (new BufferedWriter(new FileWriter("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Accounts.txt")))) {
            for (Account a : LoginController.getAccounts()) {
                bufferedWriter.write(a.getUsername() + "," + a.getPassword() + "," + a.getForename() + "," + a.getSurname() + "," + a.getEmployeeID() + "," + a.isAdmin() + "\n");
            }
        }
    }
    
}
