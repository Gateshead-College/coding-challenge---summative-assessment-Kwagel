package MenusAndControllers;

import AccountFunctions.LoadAccounts;
import Models.Account;

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
    
 
    public static void loadAccounts()  {
        LoadAccounts.loadAccounts();
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
