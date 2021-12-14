package MainMenu;

import AccountFunctions.LoadAccounts;
import Models.Account;

import java.io.IOException;
import java.util.ArrayList;

public class LoginController {
    static ArrayList<Account> accounts = new ArrayList<>();
    static int currentAccountIndex;
    
    public static ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    public static int getCurrentAccountIndex() {
        return currentAccountIndex;
    }
    
 
    public static void loadAccounts() throws IOException {
        accounts.add(new Account("ken","pass", "kenneth","lau", true));
        accounts.add(new Account("bob","pass1", "bob","markely", true));
        accounts.add(new Account("sid","pass2", "sid","sloth", false));
        LoadAccounts.saveAccounts();
    }
    
    public static boolean checkLogin(String username,String password){
        for ( int i = 0 ; i < accounts.size(); i++){
            if (accounts.get(i).getUsername().equalsIgnoreCase(username)&& accounts.get(i).getPassword().equals(password)){
                currentAccountIndex = i;
                return true;
            }
        }
        return false;
    }
    
}
