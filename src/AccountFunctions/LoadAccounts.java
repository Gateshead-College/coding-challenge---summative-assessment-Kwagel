package AccountFunctions;

import MainMenu.LoginController;
import Models.Account;

import java.io.*;
import java.util.Scanner;

public class LoadAccounts {
    public static void loadAccounts() throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Accounts.txt")))){
            while (scanner.hasNextLine()){
                String[] data = scanner.nextLine().split(",");
                
            }
        }
    }
    
    public static void saveAccounts() throws IOException {
        try(BufferedWriter bufferedWriter = (new BufferedWriter(new FileWriter("C:\\Users\\kenneth.a.lau\\IdeaProjects\\JavaLearning\\KeksKeebs\\Accounts.txt")))){
            for (Account a: LoginController.getAccounts()){
            
                bufferedWriter.write(a.getUsername() + "," + a.getPassword() + "," + a.getForename() + ","  + a.getSurname() + "," + a.getEmployeeID() + "," + a.isAdmin() + "\n");
            }
        }
    }
}
