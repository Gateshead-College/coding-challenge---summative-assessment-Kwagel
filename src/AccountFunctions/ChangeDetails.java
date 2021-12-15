package AccountFunctions;

import StockFunctions.Colours;
import MainMenu.LoginController;

import java.util.Scanner;

public class ChangeDetails {
    
    public static String changeDetails() {
        System.out.println(Colours.ANSI_RED + "Enter new information...");
        String newDetails = new Scanner(System.in).nextLine();
        System.out.println("Please confirm by re-entering it...");
        if (new Scanner(System.in).nextLine().equals(newDetails)) {
            return newDetails;
        }
        System.out.println("Your information didn't match, please try again...");
        return "";
    }
    
}
