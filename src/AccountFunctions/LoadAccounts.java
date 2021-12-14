package AccountFunctions;

import MainMenu.LoginController;
import Models.Account;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LoadAccounts {
    public static void loadAccounts(){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("KeksKeebs\\Accounts.txt")))){
            while (scanner.hasNextLine()){
            
            }
        }
    }
    
    public static void saveAccounts(){
        try(BufferedWriter bufferedWriter = (new BufferedWriter(new FileWriter("KeksKeebs\\Accounts.txt")))){
            for (Account a: LoginController.getAccounts()){
                bufferedWriter.write();
            }
        }
    }
}
